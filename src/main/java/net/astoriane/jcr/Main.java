package net.astoriane.jcr;

import net.astoriane.jcr.core.handler.ShutdownHandler;
import net.astoriane.jcr.core.handler.StartupHandler;
import net.astoriane.jcr.core.module.Modules;

public class Main {

	public static void main(String[] args) {
		
		StartupHandler.init();
		
		Modules.subtitleModule.launch();
		
		// Handle shutdown tasks (save configs etc.)
		ShutdownHandler.init();
	}


}