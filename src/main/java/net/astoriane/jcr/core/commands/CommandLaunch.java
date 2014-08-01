package net.astoriane.jcr.core.commands;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.core.module.Module;
import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.lib.Strings;

public class CommandLaunch implements Command {

	private int id;
	private String name;
	
	private boolean returnValue;
	
	public CommandLaunch(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void run(String[] data) {
		
		if(1 < data.length) {
			
			String moduleName = data[1];
			
			for(Module mod : Modules.list) {
				if(mod.getUnlocalizedName().equals(moduleName)) {
					returnValue = true;
					mod.launch();
				} else
					returnValue = false;
					continue;
			}
			
		} else {
			returnValue = true;
			Main.logger.error("Usage: " + "launch <moduleName>" + " try 'help' for more info.");
		}
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean returnValue() {
		return returnValue;
	}

}
