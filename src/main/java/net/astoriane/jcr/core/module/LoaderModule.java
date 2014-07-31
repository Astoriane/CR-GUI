package net.astoriane.jcr.core.module;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.lib.Commands;
import net.astoriane.jcr.lib.Strings;
import net.astoriane.jcr.util.CommandInput;

public class LoaderModule implements Module {

	private States state;

	private int id;
	private String name;
	private String unlocalizedName;

	private String[] commands;

	public LoaderModule(int id, String name) {
		this.id = id;
		this.name = name;
		setUnlocalizedName("loaderModule");
	}

	@Override
	public void load() {

		state = States.STARTUP;

		commands = Commands.commands;

		Main.logger.log(Strings.LOCALE_SYSTEM_LOAD_MODULE
				+ Strings.LOCALE_MODULE_LOADER_NAME);

		state = States.IDLE;

	}

	@Override
	public void loop() {

		String input;
		
		Main.logger.logSingle("");

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void launch() {

		load();

		while (state == States.IDLE) {
			loop();
		}

		if (state == States.EXIT)
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
