package net.astoriane.jcr.util;

import java.util.Arrays;

public class SysMessage {

	public static void sendMessage(String msg) {
		int num = msg.length();
		char[] chars = new char[num];
		Arrays.fill(chars, '-');
		String frame = new String(chars);

		System.out.println(frame);
		System.out.println(msg);
		System.out.println(frame);
	}

}
