package net.astoriane.jcr.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandInput {

	private static String read;
	
	private static BufferedReader br;

	public static void init() {

		br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;

		try {
			str = br.readLine();
			read = str;
		} catch (IOException ioe) {
			System.exit(1);
		}

	}
	
	public static void closeReader() {
		if(br != null)
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static String getString() {
		return read;
	}

}
