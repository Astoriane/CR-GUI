package net.astoriane.jcr.core.module;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.commands.Command;
import net.astoriane.jcr.core.commands.Commands;
import net.astoriane.jcr.core.handler.States;
import net.astoriane.jcr.lib.Strings;
import net.astoriane.jcr.util.CommandInput;

public class KernelModule implements Module {

	private States state;

	private int id;
	private String name;
	private String unlocalizedName;

	public KernelModule(int id, String name) {
		this.id = id;
		this.name = name;
		setUnlocalizedName("kernelModule");
	}

	@Override
	public void load() {

		state = States.STARTUP;

		Main.logger.log(Strings.LOCALE_SYSTEM_LOAD_MODULE + Strings.LOCALE_MODULE_KERNEL_NAME);
		Main.logger.log(Strings.LOCALE_MODULE_KERNEL_STARTUP);
		Main.logger.line();

		state = States.IDLE;

	}

	@Override
	public void loop() {

		state = States.WORKING;

		String input;

		Main.logger.logSingle(Strings.LOCALE_MODULE_KERNEL_DATA_ENTER);
		CommandInput.init();
		input = CommandInput.getString();

		String[] array = input.split("\\s+");

		Command command;

		loopCommands: for (Command cmd : Commands.commands) {
			if (0 < array.length && !array[0].isEmpty()) {

				if (cmd.getName().equals(array[0])) {
					Commands.getCommandFromName(array[0]).run(array);
					state = States.EXIT;
					break loopCommands;
				} else {
					Main.logger.error(Strings.LOCALE_MODULE_KERNEL_ERROR_INVALID);
					state = States.IDLE;
					continue loopCommands;
				}

			} else if (array[0].isEmpty()) {
				Main.logger.error(Strings.LOCALE_MODULE_KERNEL_ERROR_EMPTY);
				state = States.IDLE;
				break loopCommands;
			} else {
				state = States.IDLE;
				continue;
			}

		}

	}

	@Override
	public void exit() {

		state = States.EXIT;

	}

	@Override
	public void launch() {

		load();

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

	@Override
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
}
