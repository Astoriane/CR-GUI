package net.astoriane.jcr;

import net.astoriane.jcr.core.commands.Commands;
import net.astoriane.jcr.core.handler.ShutdownHandler;
import net.astoriane.jcr.core.handler.StartupHandler;
import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.util.Logger;

public class Main {

	public static Logger logger = new Logger();

	public static void main(String[] args) {

		StartupHandler.init();

		Commands.init();

		Modules.addList();

		if (args == null || args.length <= 0)
			Modules.kernelModule.launch();
		else if (0 < args.length)
			Modules.getModuleFromName(args[0]).launch();

		// Handle shutdown tasks (save configs etc.)
		ShutdownHandler.init();
	}

}