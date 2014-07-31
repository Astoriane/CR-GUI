package net.astoriane.jcr.core.subtitles;

import java.io.File;
import java.io.IOException;

import net.astoriane.jcr.util.CrunchyUrl;
import net.astoriane.jcr.util.PythonLauncher;

import org.apache.commons.io.FileUtils;

public class SubtitleDecoder {

	public static void downloadSubtitles(String url, String lang) {

		PythonLauncher.launchPythonScript("lib/crunchy-xml-decoder/decode.py", url + " " + lang);

		File subFile = new File("export.ass"), destFile = new File(
				"downloads/subs/" + CrunchyUrl.getSeriesFromUrl(url).replaceAll("[^a-zA-Z0-9\\.\\-]", " ") + ".ass");

		try {
			if (subFile.exists() && !destFile.exists())
				FileUtils.moveFile(subFile, destFile);
			else if (subFile.exists() && destFile.exists()) {
				destFile.delete();
				FileUtils.moveFile(subFile, destFile);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
