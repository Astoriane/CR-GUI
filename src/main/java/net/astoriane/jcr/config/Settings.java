package net.astoriane.jcr.config;

import java.util.ArrayList;
import java.util.List;

public class Settings {
	
	public static List<String> opts = new ArrayList<>();

	public static final String appLanguage_Name = "appLanguage";
	public static final String videoQuality_Name = "videoQuality";
	public static final String subtitleLanguage_Name = "subtitleLanguage";

	public static String appLanguage;

	// Available video qualities are: "android", "360p", "480p", "720p", "1080p"
	public static String videoQuality;

	// Available languages are: English, Espanol, Espanol_Espana, Francais,
	// Portugues, Turkce, Italiano
	public static String subtitleLanguage;

	public static final String videoQuality_Default = "720p";
	public static final String subtitleLanguage_Default = "English";
	public static final String appLanguage_Default = "English";

	public static void setVideoQuality(String quality) {
		videoQuality = quality;
	}

	public static void setSubtitleLanguage(String language) {
		subtitleLanguage = language;
	}
	
	public static void list() {
		opts.add(appLanguage_Name);
		opts.add(videoQuality_Name);
		opts.add(subtitleLanguage_Name);
	}

}
