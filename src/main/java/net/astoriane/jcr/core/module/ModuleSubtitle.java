package net.astoriane.jcr.core.module;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.subtitles.DownloadSubtitles;
import net.astoriane.jcr.lib.State;
import net.astoriane.jcr.lib.Strings;

public class ModuleSubtitle implements Module {

	private static State state = DownloadSubtitles.state;

	private int id;
	private String name;
	private String unlocalizedName;

	public ModuleSubtitle(int id, String name) {
		this.id = id;
		this.name = name;
		setUnlocalizedName("subtitleModule");
	}

	@Override
	public void load() {

		state = State.STARTUP;

		Main.logger.line();
		Main.logger.log(Strings.LOCALE_SYSTEM_LOAD_MODULE + Strings.LOCALE_MODULE_SUBTITLE_NAME);
		Main.logger.log(Strings.LOCALE_MODULE_SUBTITLE_STARTUP);
		Main.logger.line();

		state = State.IDLE;

	}

	@Override
	public void loop() {

		DownloadSubtitles.init();
		state = DownloadSubtitles.state;

	}

	@Override
	public void exit() {
		Modules.kernelModule.launch();
	}

	@Override
	public void launch() {
		load();

		if (state != State.IDLE)
			state = State.IDLE;

		while (state == State.IDLE) {
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

	@Override
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
}
