package net.astoriane.jcr.core.subtitles;

import net.astoriane.jcr.config.Settings;
import net.astoriane.jcr.lib.State;
import net.astoriane.jcr.lib.Strings;
import net.astoriane.jcr.util.CommandInput;
import net.astoriane.jcr.util.CrunchyUrl;
import net.astoriane.jcr.util.SysMessage;

public class DownloadSubtitles {

	public static State state = State.STARTUP;

	private static String crUrl;

	public static void init() {
		state = State.STARTUP;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		state = State.IDLE;

		while (state == State.IDLE) {
			System.out.print(Strings.LOCALE_SYSTEM_DATA_ENTER + ": ");
			CommandInput.init();
			crUrl = CommandInput.getString();
			System.out.println("----------------------------");
			if (crUrl.contains("http://") && crUrl.contains(".com")) {
				state = State.WORKING;
			} else if (crUrl == null || crUrl.isEmpty()) {
				state = State.EXIT;
				return;
			} else {
				SysMessage.sendMessage(Strings.LOCALE_MODULE_SUBTITLE_ERROR_URL);
				return;
			}
		}

		while (state == State.WORKING) {
			System.out.println(Strings.LOCALE_MODULE_SUBTITLE_LAUNCH_SCRIPT + " " + CrunchyUrl.getSeriesFromUrl(crUrl));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			SubtitleDecoder.downloadSubtitles(crUrl, Settings.subtitleLanguage);

			state = State.IDLE;

			return;
		}

		if (state == State.EXIT) {
			crUrl = null;
		}

	}

}
