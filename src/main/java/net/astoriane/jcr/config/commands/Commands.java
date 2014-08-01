package net.astoriane.jcr.config.commands;

import java.util.ArrayList;
import java.util.List;

public class Commands {

	public static List<Command> commands = new ArrayList<Command>();
	
	public static Command exit = new CommandExit(0, "exit");
	
	public static void init() {
		
		commands.add(exit);
		
	}
	
	public static Command getCommandFromName(String s) {
		
		for(Command cmd : commands) {
			if(cmd.getName().equals(s)) {
				return cmd;
			} else
				continue;
		}
		
		return null;
	}
}
