package net.astoriane.jcr.core.handler;

import java.io.FileOutputStream;
import java.io.IOException;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.config.Configuration;
import net.astoriane.jcr.lib.Strings;

public class ShutdownHandler {

	private static Thread t;

	public static void init() {
		t = new Thread() {
			@Override
			public void run() {
				Main.logger.line();
				Main.logger.log(Strings.LOCALE_SYSTEM_SHUTDOWN);
				try {
					Configuration
							.saveConfig(
									Configuration.getProps(),
									new FileOutputStream(Configuration
											.getConfigFile()));
					System.out.println(Strings.LOCALE_SYSTEM_SAVE_CONFIG_SUCCESS);
				} catch (IOException e) {
					Main.logger.error(Strings.LOCALE_SYSTEM_SAVE_CONFIG_ERROR);
				}
			}
		};

		Runtime.getRuntime().addShutdownHook(t);

	}

}
