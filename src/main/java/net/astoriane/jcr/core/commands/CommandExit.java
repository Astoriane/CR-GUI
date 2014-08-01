package net.astoriane.jcr.core.commands;

import net.astoriane.jcr.core.handler.ShutdownHandler;

public class CommandExit implements Command {

	private int id;
	private String name;
	
	private boolean returnValue;

	public CommandExit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void run(String[] data) {

		returnValue = true;
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

	@Override
	public boolean returnValue() {
		return returnValue;
	}

}
