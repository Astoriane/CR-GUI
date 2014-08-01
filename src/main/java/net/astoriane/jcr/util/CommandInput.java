package net.astoriane.jcr.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandInput {

	private static String read;

	public static void init() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;

		try {
			str = br.readLine();
			read = str;
		} catch (IOException ioe) {
			System.exit(1);
		}

	}

	public static String getString() {
		return read;
	}

}
