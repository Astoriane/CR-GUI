package net.astoriane.jcr.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandInput {
	
	private static String crUrl;

	public static void init() {
		// prompt the user to enter their name
		System.out.print("Enter crunchyroll url: ");

		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String url = null;
		
		
		try {
			url = br.readLine();
			crUrl = url;
		} catch (IOException ioe) {
			System.out.println("IO error trying to read url!");
			System.exit(1);
		}

	}
	
	public static String getCrUrl() {
		return crUrl;
	}

}
