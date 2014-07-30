package net.astoriane.jcr;

import net.astoriane.jcr.config.CRConfiguration;
import net.astoriane.jcr.core.DownloadSubtitles;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.util.ShutdownHandler;

public class Main {
	
	static States state = DownloadSubtitles.state;

	public static void main(String[] args) {
		CRConfiguration.init();
		
		while(state == States.IDLE) {
			DownloadSubtitles.init();
			state = DownloadSubtitles.state;
		}

		ShutdownHandler.init();
	}

}