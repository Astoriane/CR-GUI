package net.astoriane.jcr.core;

import net.astoriane.jcr.config.Settings;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.util.CommandInput;
import net.astoriane.jcr.util.CrunchyUrl;
import net.astoriane.jcr.util.PythonLauncher;
import net.astoriane.jcr.util.SysMessage;

public class DownloadSubtitles {

	public static States state = States.STARTUP;

	private static String crUrl;

	public static void init() {
		state = States.STARTUP;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		state = States.IDLE;

		while (state == States.IDLE) {
			CommandInput.init();
			crUrl = CommandInput.getCrUrl();
			if (crUrl.contains("http://") && crUrl.contains(".com")) {
				state = States.WORKING;
			} else if (crUrl == null || crUrl.isEmpty()) {
				state = States.EXIT;
				return;
			} else {
				SysMessage.sendMessage("Invalid url entered. " + crUrl
						+ " Please try again");
				return;
			}
		}

		while (state == States.WORKING) {
			System.out.println("Script launching for: "
					+ CrunchyUrl.getSeriesFromUrl(crUrl));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			SubtitleDecoder.downloadSubtitles(crUrl, Settings.subtitleLanguage);

			state = States.IDLE;

			return;
		}

		if (state == States.EXIT) {
			crUrl = null;
		}

	}

}
