package net.astoriane.jcr.core.module;

import net.astoriane.jcr.Main;
import net.astoriane.jcr.lib.State;
import net.astoriane.jcr.lib.Strings;
import net.astoriane.jcr.util.CommandInput;

public class ModuleLogin implements Module {
	
	private State state;
	
	private int id;
	private String name, unlocalizedName;
	
	public ModuleLogin(int id, String name) {
		this.id = id;
		this.name = name;
		setUnlocalizedName("loginModule");
	}

	@Override
	public void load() {
		
		state = State.STARTUP;

		Main.logger.line();
		Main.logger.log(Strings.LOCALE_SYSTEM_LOAD_MODULE + Strings.LOCALE_MODULE_LOGIN_NAME);
		Main.logger.log(Strings.LOCALE_MODULE_LOGIN_STARTUP);
		Main.logger.line();

		state = State.IDLE;
		
	}

	@Override
	public void loop() {
		
		state = State.WORKING;
		
		String user, pass;
		
		Main.logger.logSingle(Strings.LOCALE_MODULE_LOGIN_PROMPT_USERNAME);
		CommandInput.init();
		user = CommandInput.getString();
		
		Main.logger.logSingle(Strings.LOCALE_MODULE_LOGIN_PROMPT_PASSWORD);
		CommandInput.init();
		pass = CommandInput.getString();
		
		Main.logger.line();
		Main.logger.log(user + ", " + pass);
		
		state = State.DONE;
		
	}

	@Override
	public void exit() {
		state = State.EXIT;
	}

	@Override
	public void launch() {
		load();
		
		while (state == State.IDLE)
			loop();
		
		exit();
		
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
	
	private void setUnlocalizedName(String s) {
		this.unlocalizedName = s;
	}

	@Override
	public String getName() {
		return name;
	}

}
