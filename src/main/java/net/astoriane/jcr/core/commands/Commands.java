package net.astoriane.jcr.core.commands;

import java.util.ArrayList;
import java.util.List;

import net.astoriane.jcr.lib.Strings;

public class Commands {

	public static List<Command> list = new ArrayList<Command>();

	public static Command exit;
	public static Command help;
	public static Command launch;
	public static Command config;

	public static void init() {
		
		exit = new CommandExit(0, "exit");
		help = new CommandHelp(1, "help");
		launch = new CommandLaunch(2, "launch");
		config = new CommandConfigure(3, "configure");
		
		list.add(exit.getId(), exit);
		list.add(help.getId(), help);
		list.add(launch.getId(), launch);
		list.add(config.getId(), config);
		
	}

	public static Command getCommandFromName(String s) {

		for (Command cmd : list) {
			if (cmd.getName().equals(s)) {
				return cmd;
			} else
				continue;
		}

		return null;
	}
}
