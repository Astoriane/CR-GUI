package net.astoriane.jcr;

import net.astoriane.jcr.config.CRConfiguration;
import net.astoriane.jcr.core.handler.LocalizationHandler;
import net.astoriane.jcr.core.module.Modules;
import net.astoriane.jcr.util.ShutdownHandler;

public class Main {

	public static void main(String[] args) {
		
		// Initialize configuration files.
		CRConfiguration.init();
		
		// Load and configura localization files.
		LocalizationHandler.handleLocales();
		
		Modules.subtitleModule.launch();
		
		// Handle shutdown tasks (save configs etc.)
		ShutdownHandler.init();
	}


}