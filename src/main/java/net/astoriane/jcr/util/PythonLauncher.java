package net.astoriane.jcr.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.lib.State;

public class PythonLauncher {

	private static boolean isTerminated = false;

	private static void getConsoleOutput(Process p) {
		String s = null;

		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

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
		
		final String path = pathToScript, 
				argz = args;
		
		Thread t = new Thread() {
			public void run() {
				Process p;
				try {
					p = Runtime.getRuntime().exec("python " + path + " " + argz);
					getConsoleOutput(p);
					p.waitFor();
					isTerminated = true;
					Thread.sleep(1000);
					this.interrupt();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		};
		
		t.start();
		
		if(!t.isAlive())
			Modules.loginModule.setState(State.DONE);
	}

	public static boolean isProcessTerminated() {
		return isTerminated;
	}

}
