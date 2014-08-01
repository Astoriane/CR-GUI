package net.astoriane.jcr.core.handler;

import java.util.Arrays;
import java.util.Date;

import net.astoriane.jcr.config.Configuration;
import net.astoriane.jcr.lib.Locales;

public class StartupHandler {

	public static void init() {

		startupMessage();

		Locales.list();

		// Load and configura localization files.
		LocalizationHandler.handleLocales();

		// Initialize configuration files.
		Configuration.init();

	}

	private static void startupMessage() {

		int num = asciiMsg[0].length() + 6;
		char[] chars = new char[num];
		Arrays.fill(chars, '#');
		String frame = new String(chars);

		System.out.println(frame);

		for (String s : asciiMsg) {
			System.out.println("#  " + s + "  #");
		}

		System.out.println(frame);
		System.out.println("jCrunchyroll - Version: 0.03-beta - " + new Date().toString());
		System.out.println();
	}

	private static String[] asciiMsg = { "   _ _____                       _                     _ _ ",
			"  (_)  __ \\                     | |                   | | |",
			"   _| /  \\/_ __ _   _ _ __   ___| |__  _   _ _ __ ___ | | |",
			"  | | |   | '__| | | | '_ \\ / __| '_ \\| | | | '__/ _ \\| | |",
			"  | | \\__/\\ |  | |_| | | | | (__| | | | |_| | | | (_) | | |",
			"  | |\\____/_|   \\__,_|_| |_|\\___|_| |_|\\__, |_|  \\___/|_|_|",
			" _/ |                                   __/ |              ",
			"|__/                                   |___/               "

	};

}
