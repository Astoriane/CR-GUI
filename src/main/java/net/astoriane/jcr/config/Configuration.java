package net.astoriane.jcr.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.lib.Strings;

public class Configuration {

	private static File configPath = new File("config/"),
			configFile = new File(configPath.getAbsolutePath() + File.separator
					+ "cr_configuration.cfg");

	private static Properties prop = new Properties();
	private static OutputStream output = null;
	private static InputStream input = null;

	public static void init() {

		if (createFiles()) {
			
			try {

				output = new FileOutputStream(configFile);

				prop.setProperty(Settings.appLanguage_Name, Settings.appLanguage_Default);
				prop.setProperty(Settings.videoQuality_Name,
						Settings.videoQuality_Default);
				prop.setProperty(Settings.subtitleLanguage_Name,
						Settings.subtitleLanguage_Default);

				prop.store(output, "Cruchyroll downloader settings");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			loadConfig(prop, input);
			Main.logger.log(Strings.LOCALE_SYSTEM_LOAD_CONFIG);
			Main.logger.log("");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static boolean createFiles() {
		if (configPath.exists() && configFile.exists())
			return false;
		else {
			configPath.mkdir();
			try {
				configFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (configPath.exists() && configFile.exists()) {
				Main.logger.log(Strings.LOCALE_SYSTEM_CREATE_CONFIG);
				Main.logger.log(Strings.LOCALE_SYSTEM_CREATE_DIR + configPath.getPath());
				return true;
			} else
				return false;
		}
	}

	private static void loadConfig(Properties p, InputStream input)
			throws IOException {

		input = new FileInputStream(configFile);

		p.load(input);

		Settings.appLanguage = p.getProperty(Settings.appLanguage_Name);
		Settings.subtitleLanguage = p
				.getProperty(Settings.subtitleLanguage_Name);
		Settings.videoQuality = p.getProperty(Settings.videoQuality_Name);

		if (input != null)
			try {
				input.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

	public static void saveConfig(Properties p, OutputStream out)
			throws IOException {

		p.setProperty(Settings.videoQuality_Name, Settings.videoQuality);
		p.setProperty(Settings.subtitleLanguage_Name, Settings.subtitleLanguage);
		p.store(out, null);
		if (out != null)
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static File getConfigFile() {
		return configFile;
	}

	public static Properties getProps() {
		return prop;
	}

}
