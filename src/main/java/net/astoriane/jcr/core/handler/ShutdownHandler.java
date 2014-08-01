package net.astoriane.jcr.core.handler;

import java.io.FileOutputStream;
import java.io.IOException;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.config.Configuration;

public class ShutdownHandler {

	private static Thread t;

	public static void init() {
		t = new Thread() {
			@Override
			public void run() {
				Main.logger.line();
				System.out
						.println("Application shutting down... saving configuration.");
				try {
					Configuration
							.saveConfig(
									Configuration.getProps(),
									new FileOutputStream(Configuration
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
