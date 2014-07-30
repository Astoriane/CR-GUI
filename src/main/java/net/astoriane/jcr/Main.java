package net.astoriane.jcr;

import net.astoriane.jcr.config.CRConfiguration;
import net.astoriane.jcr.config.Settings;
import net.astoriane.jcr.core.SubtitleDecoder;
import net.astoriane.jcr.util.CommandInput;
import net.astoriane.jcr.util.CrunchyUrl;
import net.astoriane.jcr.util.ShutdownHandler;

public class Main {

	private static String crUrl = "";

	public static void main(String[] args) {
		CRConfiguration.init();
		
		CommandInput.init();
		
		System.out.println(CrunchyUrl.getSeriesFromUrl(CommandInput.getCrUrl()));

		SubtitleDecoder.downloadSubtitles(CommandInput.getCrUrl(), Settings.subtitleLanguage);
		
		// Handle shutdown tasks like saving configuration.
		ShutdownHandler.init();
	}

}