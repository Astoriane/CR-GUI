package net.astoriane.jcr.core.commands;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.config.Configuration;
import net.astoriane.jcr.config.Settings;

public class CommandConfigure implements Command {

	private int id;
	private String name;
	
	private boolean returnValue;
	
	public CommandConfigure(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void run(String[] data) {
		
		if(2 < data.length && 4 > data.length) {
			
			String option = data[1];
			String value = data[2];
			
			if(Settings.opts.contains(option)) {
				Configuration.setConfigOption(option, value);
				Main.logger.line();
				Main.logger.log("Done! Set " + option + " as " + value);
				Main.logger.line();
				returnValue = true;
			} else {
				//TODO
				Main.logger.error("Choosen option is invalid.");
				Main.logger.line();
				Main.logger.log("Valid options are: ");
				for(String s : Settings.opts) {
					Main.logger.log("- " + s);
				}
				Main.logger.line();
				returnValue = true;
			}
			
			
		} else {
			//TODO Externalize
			Main.logger.error("Usage: " + "configure <option> <value>");
			returnValue = true;
		}
		
		
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
