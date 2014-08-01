package net.astoriane.jcr.util;

public class Logger {

	public void error(String s) {
		SysMessage.sendMessage(s);
	}

	public void log(String s) {
		System.out.println(s);
	}

	public void logSingle(String s) {
		System.out.print(s);
	}

	public void line() {
		System.out.println();
	}

}
