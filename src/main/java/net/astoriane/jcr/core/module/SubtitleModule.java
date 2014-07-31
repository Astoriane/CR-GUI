package net.astoriane.jcr.core.module;

import net.astoriane.jcr.core.DownloadSubtitles;
import net.astoriane.jcr.core.handler.States;

public class SubtitleModule implements Module {

	private static States state = DownloadSubtitles.state;

	private int id;
	private String name;
	
	public SubtitleModule(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void load() {

	}

	@Override
	public void loop() {

		DownloadSubtitles.init();
		state = DownloadSubtitles.state;

	}

	@Override
	public void exit() {

	}

	@Override
	public void launch() {
		load();

		if (state != States.IDLE)
			state = States.IDLE;

		while (state == States.IDLE) {
			loop();
		}

		exit();

	}

	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
