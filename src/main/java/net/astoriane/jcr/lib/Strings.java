package net.astoriane.jcr.lib;

public class Strings {

	// Local variables
	public static String LOCALE_SYSTEM_STARTUP;
	public static String LOCALE_SYSTEM_CREATE_CONFIG;
	public static String LOCALE_SYSTEM_CREATE_DIR;
	public static String LOCALE_SYSTEM_LOAD_CONFIG;
	public static String LOCALE_SYSTEM_LOAD_CONFIG_SUCCESS;
	public static String LOCALE_SYSTEM_LOAD_CONFIG_ERROR;
	public static String LOCALE_SYSTEM_SAVE_CONFIG;
	public static String LOCALE_SYSTEM_SAVE_CONFIG_SUCCESS;
	public static String LOCALE_SYSTEM_SAVE_CONFIG_ERROR;
	public static String LOCALE_SYSTEM_DATA_ENTER;
	public static String LOCALE_SYSTEM_LOAD_MODULE;
	public static String LOCALE_SYSTEM_SHUTDOWN;

	public static String LOCALE_MODULE_KERNEL_NAME;
	public static String LOCALE_MODULE_KERNEL_STARTUP;
	public static String LOCALE_MODULE_KERNEL_DATA_ENTER;
	public static String LOCALE_MODULE_KERNEL_COMMANDS;
	public static String LOCALE_MODULE_KERNEL_COMMANDS_USAGE;
	public static String LOCALE_MODULE_KERNEL_ERROR_INVALID;
	public static String LOCALE_MODULE_KERNEL_ERROR_EMPTY;

	public static String LOCALE_MODULE_SUBTITLE_NAME;
	public static String LOCALE_MODULE_SUBTITLE_STARTUP;
	public static String LOCALE_MODULE_SUBTITLE_LAUNCH_SCRIPT;
	public static String LOCALE_MODULE_SUBTITLE_LOADED_CONFIG;
	public static String LOCALE_MODULE_SUBTITLE_LOADED_SCRIPT;
	public static String LOCALE_MODULE_SUBTITLE_DOWNLOAD;
	public static String LOCALE_MODULE_SUBTITLE_SUCCESS;
	public static String LOCALE_MODULE_SUBTITLE_ERROR;
	public static String LOCALE_MODULE_SUBTITLE_ERROR_URL;
	
	public static String LOCALE_MODULE_LOGIN_NAME;
	public static String LOCALE_MODULE_LOGIN_STARTUP;
	public static String LOCALE_MODULE_LOGIN_PROMPT_USERNAME;
	public static String LOCALE_MODULE_LOGIN_PROMPT_PASSWORD;
	public static String LOCALE_MODULE_LOGIN_ERROR;
	public static String LOCALE_MODULE_LOGIN_ERROR_INVALID_CHARACTER;
	public static String LOCALE_MODULE_LOGIN_ERROR_INVALID_LOGIN;
	public static String LOCALE_MODULE_LOGIN_ERROR_SCRIPT;
	public static String LOCALE_MODULE_LOGIN_SUCCESS;
	public static String LOCALE_MODULE_LOGIN_FILE_SAVE;
	public static String LOCALE_MODULE_LOGIN_FILE_SAVE_SUCCESS;
	public static String LOCALE_MODULE_LOGIN_FILE_SAVE_ERROR;
	public static String LOCALE_MODULE_LOGIN_DONE;

	// Access keys
	public static final String SYSTEM_STARTUP = "system.startup";
	public static final String SYSTEM_CREATE_CONFIG = "system.createConfig";
	public static final String SYSTEM_CREATE_DIR = "system.createDir";
	public static final String SYSTEM_LOAD_CONFIG = "system.loadConfig";
	public static final String SYSTEM_LOAD_CONFIG_SUCCESS = "system.loadConfig.success";
	public static final String SYSTEM_LOAD_CONFIG_ERROR = "system.loadConfig.error";
	public static final String SYSTEM_SAVE_CONFIG = "system.saveConfig";
	public static final String SYSTEM_SAVE_CONFIG_SUCCESS = "system.saveConfig.success";
	public static final String SYSTEM_SAVE_CONFIG_ERROR = "system.saveConfig.error";
	public static final String SYSTEM_DATA_ENTER = "system.enterData";
	public static final String SYSTEM_LOAD_MODULE = "system.loadModule";
	public static final String SYSTEM_SHUTDOWN = "system.shutdown";

	public static final String MODULE_KERNEL_NAME = "module.kernel.name";
	public static final String MODULE_KERNEL_STARTUP = "module.kernel.startup";
	public static final String MODULE_KERNEL_COMMANDS = "module.kernel.commands";
	public static final String MODULE_KERNEL_COMMANDS_USAGE = "module.kernel.commandsUsage";
	public static final String MODULE_KERNEL_DATA_ENTER = "module.kernel.enterData";
	public static final String MODULE_KERNEL_ERROR_INVALID = "module.kernel.errorInvalid";
	public static final String MODULE_KERNEL_ERROR_EMPTY = "module.kernel.errorEmpty";

	public static final String MODULE_SUBTITLE_NAME = "module.subtitle.name";
	public static final String MODULE_SUBTITLE_STARTUP = "module.subtitle.startup";
	public static final String MODULE_SUBTITLE_LAUNCH_SCRIPT = "module.subtitle.launchScript";
	public static final String MODULE_SUBTITLE_LOADED_CONFIG = "module.subtitle.loaded";
	public static final String MODULE_SUBTITLE_LOADED_SCRIPT = "module.subtitle.scriptLoad";
	public static final String MODULE_SUBTITLE_DOWNLOAD = "module.subtitle.download";
	public static final String MODULE_SUBTITLE_SUCCESS = "module.subtitle.success";
	public static final String MODULE_SUBTITLE_ERROR = "module.subtitle.error";
	public static final String MODULE_SUBTITLE_ERROR_URL = "module.subtitle.errorUrl";
	
	public static final String MODULE_LOGIN_NAME = "module.login.name";
	public static final String MODULE_LOGIN_STARTUP = "module.login.startup";
	public static final String MODULE_LOGIN_PROMPT_USERNAME = "module.login.promptUsername";
	public static final String MODULE_LOGIN_PROMPT_PASSWORD = "module.login.promptPassword";
	public static final String MODULE_LOGIN_ERROR = "module.login.error";
	public static final String MODULE_LOGIN_ERROR_INVALID_CHARACTER = "module.login.errorInvalidCharacter";
	public static final String MODULE_LOGIN_ERROR_INVALID_LOGIN = "module.login.errorInvalidLogin";
	public static final String MODULE_LOGIN_ERROR_SCRIPT = "module.login.errorScript";
	public static final String MODULE_LOGIN_SUCCESS = "module.login.success";
	public static final String MODULE_LOGIN_FILE_SAVE = "module.login.saveFile";
	public static final String MODULE_LOGIN_FILE_SAVE_SUCCESS = "module.login.saveFileSuccess";
	public static final String MODULE_LOGIN_FILE_SAVE_ERROR = "module.login.saveFileError";
	public static final String MODULE_LOGIN_DONE = "module.login.done";

	// Default values
	public static final String SYSTEM_STARTUP_DEFAULT = "Loading up jCrunchyroll...";
	public static final String SYSTEM_CREATE_CONFIG_DEFAULT = "Configuration does not exist. Creating...";
	public static final String SYSTEM_CREATE_DIR_DEFAULT = "Directory created: ";
	public static final String SYSTEM_LOAD_CONFIG_DEFAULT = "Loading configuration files...";
	public static final String SYSTEM_LOAD_CONFIG_SUCCESS_DEFAULT = "Configurations loaded successfully.";
	public static final String SYSTEM_LOAD_CONFIG_ERROR_DEFAULT = "Configurations could not be loaded due to an error.";
	public static final String SYSTEM_SAVE_CONFIG_DEFAULT = "Saving configuration files...";
	public static final String SYSTEM_SAVE_CONFIG_SUCCESS_DEFAULT = "Configurations saved successfully.";
	public static final String SYSTEM_SAVE_CONFIG_ERROR_DEFAULT = "Configurations could not be saved due to an error.";
	public static final String SYSTEM_DATA_ENTER_DEFAULT = "Enter Crunchyroll URL";
	public static final String SYSTEM_LOAD_MODULE_DEFAULT = "Module loaded: ";
	public static final String SYSTEM_SHUTDOWN_DEFAULT = "Shutting down application...";

	public static final String MODULE_KERNEL_NAME_DEFAULT = "Kernel Module";
	public static final String MODULE_KERNEL_STARTUP_DEFAULT = "jCrunchyroll Kernel Module v1.2";
	public static final String MODULE_KERNEL_COMMANDS_DEFAULT = "Available commands: ";
	public static final String MODULE_KERNEL_COMMANDS_USAGE_DEFAULT = "Usage: ";
	public static final String MODULE_KERNEL_DATA_ENTER_DEFAULT = "Enter command: ";
	public static final String MODULE_KERNEL_ERROR_INVALID_DEFAULT = "Given command is invalid please try again.";
	public static final String MODULE_KERNEL_ERROR_EMPTY_DEFAULT = "Please enter a command to proceed, type 'help' for more info.";

	public static final String MODULE_SUBTITLE_NAME_DEFAULT = "Subtitle Module";
	public static final String MODULE_SUBTITLE_STARTUP_DEFAULT = "jCrunchyroll Subtitle Module v0.3";
	public static final String MODULE_SUBTITLE_LOADED_CONFIG_DEFAULT = "Subtitle module configuration - Loaded";
	public static final String MODULE_SUBTITLE_LOADED_SCRIPT_DEFAULT = "Loaded parsing script from python library.";
	public static final String MODULE_SUBTITLE_LAUNCH_SCRIPT_DEFAULT = "Launching script for: ";
	public static final String MODULE_SUBTITLE_DOWNLOAD_DEFAULT = "Commencing download operation.";
	public static final String MODULE_SUBTITLE_SUCCESS_DEFAULT = "File was downloaded and converted successfully";
	public static final String MODULE_SUBTITLE_ERROR_DEFAULT = "There was an error while downloading your file";
	public static final String MODULE_SUBTITLE_ERROR_URL_DEFAULT = "Given url could not be parsed.";
	
	public static final String MODULE_LOGIN_NAME_DEFAULT = "Login Module";
	public static final String MODULE_LOGIN_STARTUP_DEFAULT = "jCrunchyroll Login Module v0.1";
	public static final String MODULE_LOGIN_PROMPT_USERNAME_DEFAULT = "Enter your CR username: ";
	public static final String MODULE_LOGIN_PROMPT_PASSWORD_DEFAULT = "Enter your CR password: ";
	public static final String MODULE_LOGIN_ERROR_DEFAULT = "Login Module has encountered an error.";
	public static final String MODULE_LOGIN_ERROR_INVALID_CHARACTER_DEFAULT = "Error: Invalid character used.";
	public static final String MODULE_LOGIN_ERROR_INVALID_LOGIN_DEFAULT = "Error. Login invalid.";
	public static final String MODULE_LOGIN_ERROR_SCRIPT_DEFAULT = "Script encountered an error during launch.";
	public static final String MODULE_LOGIN_SUCCESS_DEFAULT = "Successfully logged in on Crunchyroll.";
	public static final String MODULE_LOGIN_FILE_SAVE_DEFAULT = "Saving login cookies to file...";
	public static final String MODULE_LOGIN_FILE_SAVE_SUCCESS_DEFAULT = "File was saved successfully.";
	public static final String MODULE_LOGIN_FILE_SAVE_ERROR_DEFAULT = "File could not be saved due to an error.";
	public static final String MODULE_LOGIN_DONE_DEFAULT = "Done!";

}
