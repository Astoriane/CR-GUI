package net.astoriane.jcr;

import net.astoriane.jcr.config.CRConfiguration;
import net.astoriane.jcr.core.DownloadSubtitles;
import net.astoriane.jcr.core.handler.LocalizationHandler;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.util.ShutdownHandler;

public class Main {

	static States state = DownloadSubtitles.state;

	public static void main(String[] args) {
		CRConfiguration.init();
		
		LocalizationHandler.handleLocales();

		if (state == States.STARTUP) {
			initSubDownloader();
			state = DownloadSubtitles.state;
		}
		
		while (state == States.IDLE) {
			initSubDownloader();
			state = DownloadSubtitles.state;
		}

		ShutdownHandler.init();
	}

	private static void initSubDownloader() {
		DownloadSubtitles.init();
	}

}