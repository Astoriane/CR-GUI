package net.astoriane.jcr.core.commands;

import net.astoriane.jcr.core.handler.ShutdownHandler;

public class CommandExit implements Command {

	private int id;
	private String name;

	public CommandExit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void run(String[] data) {

		ShutdownHandler.init();
		System.exit(0);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getId() {
		return id;
	}

}
