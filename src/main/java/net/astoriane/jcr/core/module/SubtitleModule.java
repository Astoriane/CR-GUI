package net.astoriane.jcr.core.module;

import net.astoriane.jcr.core.DownloadSubtitles;
import net.astoriane.jcr.core.handler.States;

public class SubtitleModule {
	
	private static States state = DownloadSubtitles.state;
	
	public static void init() {
		if (state == States.STARTUP) {
			initSubDownloader();
			state = DownloadSubtitles.state;
		}
		
		while (state == States.IDLE) {
			initSubDownloader();
			state = DownloadSubtitles.state;
		}
	}
	
	private static void initSubDownloader() {
		DownloadSubtitles.init();
	}


}
