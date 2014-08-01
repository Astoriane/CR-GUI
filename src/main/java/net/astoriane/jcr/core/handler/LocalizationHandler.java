package net.astoriane.jcr.core.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import net.astoriane.jcr.config.Settings;
import net.astoriane.jcr.lib.Locales;
import net.astoriane.jcr.lib.Strings;

public class LocalizationHandler {

	private static Properties p = new Properties();
	private static InputStream input = null;
	private static OutputStream output = null;

	private static File defaultLocale;
	private static File choosenLocale;

	private static String choosenLang;

	public static final String localeDir = "config/lang/";

	public static void handleLocales() {

		defaultLocale = new File(localeDir + "en_US.xml");

		if (!defaultLocale.exists()) {

			defaultLocale.getParentFile().mkdirs();

			try {
				defaultLocale.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				createDefaultLang();
			}
		}

		for (int i = 0; i < Locales.langs.length; i++) {
			if (Locales.langs[i].equals(Settings.appLanguage)) {

				choosenLang = Locales.tags[i];

				break;
			}
		}

		choosenLocale = new File(localeDir + choosenLang + ".xml");

		if (!choosenLocale.exists())
			choosenLocale = defaultLocale;

		try {

			input = new FileInputStream(choosenLocale);

			// load a properties file
			p.loadFromXML(input);

			Strings.LOCALE_SYSTEM_STARTUP = p.getProperty(Strings.SYSTEM_STARTUP);
			Strings.LOCALE_SYSTEM_CREATE_CONFIG = p.getProperty(Strings.SYSTEM_CREATE_CONFIG);
			Strings.LOCALE_SYSTEM_CREATE_DIR = p.getProperty(Strings.SYSTEM_CREATE_DIR);
			Strings.LOCALE_SYSTEM_LOAD_CONFIG = p.getProperty(Strings.SYSTEM_LOAD_CONFIG);
			Strings.LOCALE_SYSTEM_LOAD_CONFIG_SUCCESS = p.getProperty(Strings.SYSTEM_LOAD_CONFIG_SUCCESS);
			Strings.LOCALE_SYSTEM_LOAD_CONFIG_ERROR = p.getProperty(Strings.SYSTEM_LOAD_CONFIG_ERROR);
			Strings.LOCALE_SYSTEM_SAVE_CONFIG = p.getProperty(Strings.SYSTEM_SAVE_CONFIG);
			Strings.LOCALE_SYSTEM_SAVE_CONFIG_SUCCESS = p.getProperty(Strings.SYSTEM_SAVE_CONFIG_SUCCESS);
			Strings.LOCALE_SYSTEM_SAVE_CONFIG_ERROR = p.getProperty(Strings.SYSTEM_SAVE_CONFIG_ERROR);
			Strings.LOCALE_SYSTEM_DATA_ENTER = p.getProperty(Strings.SYSTEM_DATA_ENTER);
			Strings.LOCALE_SYSTEM_LOAD_MODULE = p.getProperty(Strings.SYSTEM_LOAD_MODULE);
			Strings.LOCALE_SYSTEM_SHUTDOWN = p.getProperty(Strings.SYSTEM_SHUTDOWN);

			Strings.LOCALE_MODULE_KERNEL_NAME = p.getProperty(Strings.MODULE_KERNEL_NAME);
			Strings.LOCALE_MODULE_KERNEL_STARTUP = p.getProperty(Strings.MODULE_KERNEL_STARTUP);
			Strings.LOCALE_MODULE_KERNEL_COMMANDS = p.getProperty(Strings.MODULE_KERNEL_COMMANDS);
			Strings.LOCALE_MODULE_KERNEL_COMMANDS_USAGE = p.getProperty(Strings.MODULE_KERNEL_COMMANDS_USAGE_DEFAULT);
			Strings.LOCALE_MODULE_KERNEL_DATA_ENTER = p.getProperty(Strings.MODULE_KERNEL_DATA_ENTER);
			Strings.LOCALE_MODULE_KERNEL_ERROR_INVALID = p.getProperty(Strings.MODULE_KERNEL_ERROR_INVALID);
			Strings.LOCALE_MODULE_KERNEL_ERROR_EMPTY = p.getProperty(Strings.MODULE_KERNEL_ERROR_EMPTY);

			Strings.LOCALE_MODULE_SUBTITLE_NAME = p.getProperty(Strings.MODULE_SUBTITLE_NAME);
			Strings.LOCALE_MODULE_SUBTITLE_STARTUP = p.getProperty(Strings.MODULE_SUBTITLE_STARTUP);
			Strings.LOCALE_MODULE_SUBTITLE_LAUNCH_SCRIPT = p.getProperty(Strings.MODULE_SUBTITLE_LAUNCH_SCRIPT);
			Strings.LOCALE_MODULE_SUBTITLE_LOADED_CONFIG = p.getProperty(Strings.MODULE_SUBTITLE_LOADED_CONFIG);
			Strings.LOCALE_MODULE_SUBTITLE_LOADED_SCRIPT = p.getProperty(Strings.MODULE_SUBTITLE_LOADED_SCRIPT);
			Strings.LOCALE_MODULE_SUBTITLE_DOWNLOAD = p.getProperty(Strings.MODULE_SUBTITLE_DOWNLOAD);
			Strings.LOCALE_MODULE_SUBTITLE_SUCCESS = p.getProperty(Strings.MODULE_SUBTITLE_SUCCESS);
			Strings.LOCALE_MODULE_SUBTITLE_ERROR = p.getProperty(Strings.MODULE_SUBTITLE_ERROR);
			Strings.LOCALE_MODULE_SUBTITLE_ERROR_URL = p.getProperty(Strings.MODULE_SUBTITLE_ERROR_URL);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private static void createDefaultLang() {

		try {

			output = new FileOutputStream(defaultLocale);

			for (int i = 0; i < Locales.entries.size(); i++) {
				p.setProperty(Locales.entries.get(i), Locales.defaultValues.get(i));
			}

			// save properties to project root folder
			p.storeToXML(output, "English language file for jCrunchyroll library");

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
