package net.astoriane.jcr.core.commands;

import java.util.ArrayList;
import java.util.List;

import net.astoriane.jcr.lib.Strings;

public class Commands {

	public static List<Command> commands = new ArrayList<Command>();

	public static Command exit;
	public static Command help;
	public static Command launch;

	public static void init() {
		
		exit = new CommandExit(0, "exit");
		help = new CommandHelp(1, "help");
		launch = new CommandLaunch(2, "launch");
		
		commands.add(exit.getId(), exit);
		commands.add(help.getId(), help);
		commands.add(launch.getId(), launch);
		
	}

	public static Command getCommandFromName(String s) {

		for (Command cmd : commands) {
			if (cmd.getName().equals(s)) {
				return cmd;
			} else
				continue;
		}

		return null;
	}
}
