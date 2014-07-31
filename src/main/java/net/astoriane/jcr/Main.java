package net.astoriane.jcr;

import net.astoriane.jcr.core.handler.ShutdownHandler;
import net.astoriane.jcr.core.handler.StartupHandler;
import net.astoriane.jcr.core.module.Module;
import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.util.Logger;

public class Main {

	public static Logger logger = new Logger();
	
	public static void main(String[] args) {
		
		StartupHandler.init();
		
		Modules.addList();
		
		Modules.loaderModule.launch();
		
		// Handle shutdown tasks (save configs etc.)
		ShutdownHandler.init();
	}


}