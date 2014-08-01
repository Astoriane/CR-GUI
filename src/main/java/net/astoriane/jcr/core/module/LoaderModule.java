package net.astoriane.jcr.core.module;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.lib.Commands;
import net.astoriane.jcr.lib.Reference;
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
		Main.logger.log(Strings.LOCALE_MODULE_LOADER_STARTUP);
		Main.logger.line();

		state = States.IDLE;

	}

	@Override
	public void loop() {

		String in;

		boolean flag = false;

		Main.logger.logSingle(Strings.LOCALE_MODULE_LOADER_DATE_ENTER);
		CommandInput.init();
		in = CommandInput.getString();

		String[] input = in.split("\\s+");

		loopCheck: for (String s : commands) {
			if (input != null || !input[0].isEmpty()) {

				switch (input[0]) {

				case "launch":
					if (!(input.length < 2)) {
						loopModule: for (Module mod : Modules.list) {
							switch (input[1]) {

							case "subtitleModule":
								flag = true;
								Modules.subtitleModule.launch();
								break loopModule;
							case "loaderModule":
								flag = true;
								Modules.loaderModule.launch();
								break loopModule;
							default:
								flag = true;
								continue loopCheck;

							}
						}
					} else {

						break loopCheck;
					}
				case "help":

					Main.logger.log(Strings.LOCALE_MODULE_LOADER_COMMANDS);
					for (String cmd : commands)
						Main.logger.log("- " + cmd);

					break loopCheck;
				case "exit":
					flag = true;
					state = States.EXIT;
					break loopCheck;
				default:
					flag = true;
					break loopCheck;

				}

			} else {
				flag = false;
				continue loopCheck;
			}
		}

		if (!flag) {
			Main.logger.log("Please enter a command.");
		}

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
