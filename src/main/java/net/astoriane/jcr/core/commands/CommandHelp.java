package net.astoriane.jcr.core.commands;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.module.Module;
import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.lib.Strings;

public class CommandHelp implements Command {
	
	private int id;
	private String name;
	private boolean returnValue;
	
	public CommandHelp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void run(String[] data) {
		
		Main.logger.line();
		Main.logger.log(Strings.LOCALE_MODULE_KERNEL_COMMANDS);
		
		for(Command cmd : Commands.commands) {
			Main.logger.log("- " + cmd.getName());
		}
		
		Main.logger.line();
		
		Main.logger.log("Modules: ");
		for(Module md : Modules.list) {
			Main.logger.log("- " + md.getUnlocalizedName() + " : " + md.getName());
		}
		
		Main.logger.line();
		
		returnValue = true;
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
