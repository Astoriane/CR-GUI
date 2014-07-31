package net.astoriane.jcr.core.module;

import net.astoriane.jcr.core.DownloadSubtitles;
import net.astoriane.jcr.core.handler.States;

public class SubtitleModule implements Module {

	private static States state = DownloadSubtitles.state;
	
	public SubtitleModule(int id, String name) {
		
	}

	public void load() {

	}

	public void loop() {

		DownloadSubtitles.init();
		state = DownloadSubtitles.state;

	}

	public void exit() {

	}

	public void launch() {
		load();
		
		if(state != States.IDLE)
			state = States.IDLE;

		while(state == States.IDLE) {
			loop();
		}
		
		exit();
		
	}

}
