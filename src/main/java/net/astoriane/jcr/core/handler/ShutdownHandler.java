package net.astoriane.jcr.core.handler;

import java.io.FileOutputStream;
import java.io.IOException;

import net.astoriane.jcr.config.CRConfiguration;

public class ShutdownHandler {

	private static Thread t;

	public static void init() {
		t = new Thread() {
			public void run() {
				System.out.println("Application shutting down... saving configuration.");
				try {
					CRConfiguration.saveConfig(
							CRConfiguration.getProps(),
							new FileOutputStream(CRConfiguration
									.getConfigFile()));
					System.out.println("Saved.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};

		Runtime.getRuntime().addShutdownHook(t);

	}

}
