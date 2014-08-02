package net.astoriane.jcr.lib;

import java.util.ArrayList;
import java.util.List;

public class Locales {

	public static final String[] langs = { "English", "French", "Turkish" };

	public static final String[] tags = { "en_US", "fr_FR", "tr_TR" };

	public static List<String> entries = new ArrayList<String>();
	public static List<String> defaultValues = new ArrayList<String>();

	@SuppressWarnings("unused")
	public static void list() {

		entries: {

			system: {
				entries.add(getNextEntryID(), Strings.SYSTEM_STARTUP);
				entries.add(getNextEntryID(), Strings.SYSTEM_CREATE_CONFIG);
				entries.add(getNextEntryID(), Strings.SYSTEM_CREATE_DIR);
				entries.add(getNextEntryID(), Strings.SYSTEM_LOAD_CONFIG);
				entries.add(getNextEntryID(), Strings.SYSTEM_LOAD_CONFIG_SUCCESS);
				entries.add(getNextEntryID(), Strings.SYSTEM_LOAD_CONFIG_ERROR);
				entries.add(getNextEntryID(), Strings.SYSTEM_SAVE_CONFIG);
				entries.add(getNextEntryID(), Strings.SYSTEM_SAVE_CONFIG_SUCCESS);
				entries.add(getNextEntryID(), Strings.SYSTEM_SAVE_CONFIG_ERROR);
				entries.add(getNextEntryID(), Strings.SYSTEM_DATA_ENTER);
				entries.add(getNextEntryID(), Strings.SYSTEM_LOAD_MODULE);
				entries.add(getNextEntryID(), Strings.SYSTEM_SHUTDOWN);
			}

			moduleKernel: {
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_NAME);
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_STARTUP);
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_COMMANDS);
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_COMMANDS_USAGE);
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_DATA_ENTER);
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_ERROR_INVALID);
				entries.add(getNextEntryID(), Strings.MODULE_KERNEL_ERROR_EMPTY);

			}

			moduleSubtitle: {
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_NAME);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_STARTUP);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_LAUNCH_SCRIPT);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_LOADED_CONFIG);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_LOADED_SCRIPT);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_DOWNLOAD);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_SUCCESS);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_ERROR);
				entries.add(getNextEntryID(), Strings.MODULE_SUBTITLE_ERROR_URL);
			}
			
			moduleLogin: {
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_NAME);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_STARTUP);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_PROMPT_USERNAME);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_PROMPT_PASSWORD);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_ERROR);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_ERROR_INVALID_CHARACTER);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_ERROR_INVALID_LOGIN);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_ERROR_SCRIPT);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_SUCCESS);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_FILE_SAVE);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_FILE_SAVE_ERROR);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_FILE_SAVE_SUCCESS);
				entries.add(getNextEntryID(), Strings.MODULE_LOGIN_DONE);
			}
		}

		defaults: {

			system: {
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_STARTUP_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_CREATE_CONFIG_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_CREATE_DIR_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_LOAD_CONFIG_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_LOAD_CONFIG_SUCCESS_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_LOAD_CONFIG_ERROR_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_SAVE_CONFIG_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_SAVE_CONFIG_SUCCESS_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_SAVE_CONFIG_ERROR_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_DATA_ENTER_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_LOAD_MODULE_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.SYSTEM_SHUTDOWN_DEFAULT);
			}

			moduleKernel: {
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_NAME_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_STARTUP_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_COMMANDS_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_COMMANDS_USAGE_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_DATA_ENTER_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_ERROR_INVALID_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_KERNEL_ERROR_EMPTY_DEFAULT);

			}

			moduleSubtitle: {
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_NAME_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_STARTUP_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_LAUNCH_SCRIPT_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_LOADED_CONFIG_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_LOADED_SCRIPT_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_DOWNLOAD_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_SUCCESS_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_ERROR_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_SUBTITLE_ERROR_URL_DEFAULT);
			}
			
			moduleLogin: {
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_NAME_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_STARTUP_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_PROMPT_USERNAME_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_PROMPT_PASSWORD_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_ERROR_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_ERROR_INVALID_CHARACTER_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_ERROR_INVALID_LOGIN_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_ERROR_SCRIPT_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_SUCCESS_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_FILE_SAVE_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_FILE_SAVE_ERROR_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_FILE_SAVE_SUCCESS_DEFAULT);
				defaultValues.add(getNextDefaultID(), Strings.MODULE_LOGIN_DONE_DEFAULT);
			}

		}
	}

	private static int getNextEntryID() {
		return entries.size();
	}

	private static int getNextDefaultID() {
		return defaultValues.size();
	}

}
