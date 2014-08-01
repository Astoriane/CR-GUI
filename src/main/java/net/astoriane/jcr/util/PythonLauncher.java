package net.astoriane.jcr.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythonLauncher {

	private static boolean isTerminated = false;

	private static void getConsoleOutput(Process p) {
		String s = null;

		BufferedReader stdInput = new BufferedReader(new InputStreamReader(
				p.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(
				p.getErrorStream()));

		try {
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}

			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void launchPythonScript(String pathToScript, String args) {
		try {
			Process p = Runtime.getRuntime().exec(
					"python " + pathToScript + " " + args);
			getConsoleOutput(p);
			p.waitFor();
			Thread.sleep(1000);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isProcessTerminated() {
		return isTerminated;
	}

}
