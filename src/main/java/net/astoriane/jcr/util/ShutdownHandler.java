package net.astoriane.jcr.util;

import java.io.FileOutputStream;
import java.io.IOException;

import net.astoriane.jcr.config.CRConfiguration;

public class ShutdownHandler {

	private static Thread t;

	public static void init() {
		t = new Thread() {
			public void run() {
				try {
					CRConfiguration.saveConfig(
							CRConfiguration.getProps(),
							new FileOutputStream(CRConfiguration
									.getConfigFile()));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};

		Runtime.getRuntime().addShutdownHook(t);

	}

}
