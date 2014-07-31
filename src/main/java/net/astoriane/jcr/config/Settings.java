package net.astoriane.jcr.config;

public class Settings {

	public static final String appLanguage_Name = "App-Language";
	public static final String videoQuality_Name = "Video-Quality";
	public static final String subtitleLanguage_Name = "Subtitle-Language";

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

}
