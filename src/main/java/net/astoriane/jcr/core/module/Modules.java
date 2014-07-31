package net.astoriane.jcr.core.module;

import net.astoriane.jcr.lib.Strings;

public class Modules {
	
	public static Module loaderModule = new LoaderModule(0, Strings.LOCALE_MODULE_LOADER_NAME);
	public static Module subtitleModule = new SubtitleModule(1, Strings.LOCALE_MODULE_SUBTITLE_NAME);

}
