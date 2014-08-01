package net.astoriane.jcr.core.module;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.core.subtitles.DownloadSubtitles;
import net.astoriane.jcr.lib.Strings;

public class SubtitleModule implements Module {

	private static States state = DownloadSubtitles.state;

	private int id;
	private String name;
	private String unlocalizedName;
	
	public SubtitleModule(int id, String name) {
		this.id = id;
		this.name = name;
		setUnlocalizedName("subtitleModule");
	}

	@Override
	public void load() {
		
		state = States.STARTUP;
		
		Main.logger.line();
		Main.logger.log(Strings.LOCALE_SYSTEM_LOAD_MODULE + Strings.LOCALE_MODULE_SUBTITLE_NAME);
		Main.logger.log(Strings.LOCALE_MODULE_SUBTITLE_STARTUP);
		Main.logger.line();
		
		state = States.IDLE;

	}

	@Override
	public void loop() {

		DownloadSubtitles.init();
		state = DownloadSubtitles.state;

	}

	@Override
	public void exit() {
		Modules.loaderModule.launch();
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

	private void setUnlocalizedName(String s) {
		this.unlocalizedName = s;
	}
	
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
}
