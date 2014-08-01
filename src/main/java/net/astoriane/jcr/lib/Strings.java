package net.astoriane.jcr.lib;

public class Strings {

	// Local variables
	public static String LOCALE_SYSTEM_STARTUP;
	public static String LOCALE_SYSTEM_CREATE_CONFIG;
	public static String LOCALE_SYSTEM_CREATE_DIR;
	public static String LOCALE_SYSTEM_LOAD_CONFIG;
	public static String LOCALE_SYSTEM_DATA_ENTER;
	public static String LOCALE_SYSTEM_LOAD_MODULE;

	public static String LOCALE_MODULE_KERNEL_NAME;
	public static String LOCALE_MODULE_KERNEL_STARTUP;
	public static String LOCALE_MODULE_KERNEL_DATE_ENTER;
	public static String LOCALE_MODULE_KERNEL_COMMANDS;

	public static String LOCALE_MODULE_SUBTITLE_NAME;
	public static String LOCALE_MODULE_SUBTITLE_STARTUP;
	public static String LOCALE_MODULE_SUBTITLE_LOADED_CONFIG;
	public static String LOCALE_MODULE_SUBTITLE_LOADED_SCRIPT;
	public static String LOCALE_MODULE_SUBTITLE_DOWNLOAD;
	public static String LOCALE_MODULE_SUBTITLE_SUCCESS;
	public static String LOCALE_MODULE_SUBTITLE_ERROR;

	// Access keys
	public static final String SYSTEM_STARTUP = "system.startup";
	public static final String SYSTEM_CREATE_CONFIG = "system.createConfig";
	public static final String SYSTEM_CREATE_DIR = "system.createDir";
	public static final String SYSTEM_LOAD_CONFIG = "system.loadConfig";
	public static final String SYSTEM_DATA_ENTER = "system.enterData";
	public static final String SYSTEM_LOAD_MODULE = "system.loadModule";

	public static final String MODULE_KERNEL_NAME = "module.loader.name";
	public static final String MODULE_KERNEL_STARTUP = "module.loader.startup";
	public static final String MODULE_KERNEL_COMMANDS = "module.loader.commands";
	public static final String MODULE_KERNEL_DATA_ENTER = "module.loader.enterData";

	public static final String MODULE_SUBTITLE_NAME = "module.subtitle.name";
	public static final String MODULE_SUBTITLE_STARTUP = "module.subtitle.startup";
	public static final String MODULE_SUBTITLE_LOADED_CONFIG = "module.subtitle.loaded";
	public static final String MODULE_SUBTITLE_LOADED_SCRIPT = "module.subtitle.scriptLoad";
	public static final String MODULE_SUBTITLE_DOWNLOAD = "module.subtitle.download";
	public static final String MODULE_SUBTITLE_SUCCESS = "module.subtitle.success";
	public static final String MODULE_SUBTITLE_ERROR = "module.subtitle.error";

	// Default values
	public static final String SYSTEM_STARTUP_DEFAULT = "Loading up jCrunchyroll...";
	public static final String SYSTEM_CREATE_CONFIG_DEFAULT = "Configuration does not exist. Creating...";
	public static final String SYSTEM_CREATE_DIR_DEFAULT = "Directory created: ";
	public static final String SYSTEM_LOAD_CONFIG_DEFAULT = "Loaded configuration files";
	public static final String SYSTEM_DATA_ENTER_DEFAULT = "Enter Crunchyroll URL";
	public static final String SYSTEM_LOAD_MODULE_DEFAULT = "Module loaded: ";

	public static final String MODULE_KERNEL_NAME_DEFAULT = "Kernel Module";
	public static final String MODULE_KERNEL_STARTUP_DEFAULT = "jCrunchyroll Kernel Module v1.2";
	public static final String MODULE_KERNEL_COMMANDS_DEFAULT = "Available commands: ";
	public static final String MODULE_KERNEL_DATA_ENTER_DEFAULT = "Enter command: ";

	public static final String MODULE_SUBTITLE_NAME_DEFAULT = "Subtitle Module";
	public static final String MODULE_SUBTITLE_STARTUP_DEFAULT = "jCrunchyroll Subtitle Module v0.3";
	public static final String MODULE_SUBTITLE_LOADED_CONFIG_DEFAULT = "Subtitle module configuration - Loaded";
	public static final String MODULE_SUBTITLE_LOADED_SCRIPT_DEFAULT = "Loaded parsing script from python library.";
	public static final String MODULE_SUBTITLE_DOWNLOAD_DEFAULT = "Commencing download operation.";
	public static final String MODULE_SUBTITLE_SUCCESS_DEFAULT = "File was downloaded and converted successfully";
	public static final String MODULE_SUBTITLE_ERROR_DEFAULT = "There was an error while downloading your file";

}
