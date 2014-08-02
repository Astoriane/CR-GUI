package net.astoriane.jcr.core.handler;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.config.Configuration;
import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.lib.Locales;
import net.astoriane.jcr.util.CommandInput;
import net.astoriane.jcr.util.Utils;

public class StartupHandler {

	public static void init() {
		
		startupMessage();

		Locales.list();

		// Load and configura localization files.
		LocalizationHandler.handleLocales();

		// Initialize configuration files.
		Configuration.init();
		
		checkCookies(new File("config/cookies.txt"));

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
	
	private static void checkCookies(File cookieFile) {
		try {
			if(!cookieFile.exists()) {
				Main.logger.line();
				Main.logger.logSingle("Cookie file does not exist, want to login to Crunchyroll? (y/n): ");
				CommandInput.init();
				String input = CommandInput.getString();
				
				switch(input) {
				case "y":
					Modules.loginModule.launch();
					break;
				case "n":
					break;
					default: 
						break;
				
				} 
				
			} else if (Utils.countLines("config/cookies.txt") < 7) {
			
				Main.logger.line();
				Main.logger.logSingle("Cookies not present in cookies.txt. Want to login to Crunchyroll? (y/n): ");
				CommandInput.init();
				String input = CommandInput.getString();
				
				switch(input) {
				case "y":
					Modules.loginModule.launch();
					break;
				case "n":
					break;
					default: 
						break;
				
				} 
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
