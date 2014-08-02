## What is jCrunchyroll?

jCrunchyroll is an in-dev java wrapper for launching python scripts that can decrypt [Crunchyroll](http://www.crunchyroll.com) streams.
This process results in obtaining of XML subtitles for CR's anime or drama shows, and/or can be used for getting (dumping) rtmp video
This application is highly experimental and is written/maintained by a student that just want to test his skills in inter-language
interactions. 

## What does it do?

Currently in development. As in version: 0.02-beta, jCrunchyroll is capable of downloading XML subtitle files from user-defined Crunchyroll
urls. And converts/decrypts them into widely known ".ssa/.ass" subtitle format while naming the resulting file according to the series.

---------------------------

As developement progressed, currently in version 0.03-beta, jCrunchyroll is a much more compact and flexible application with
Externalized string reading capabilities providing support for localization files to be created. The system is semi hardcodes 
and will probably be improved in near future, also as in flexibility jCrunchyroll now includes what I like to call: Modular Modules System or MMS for short. Which allows me to write functions on the application as modules which then can be run by the user in-app by the Modular Commands System (MCS for short) that I implemented in this version. MCS allows the developers to create runnable commands effortlessly. Currently 4 commands are available in-app, more to come with huge module rewrites.

## Current application features:

* Being able to specify options through configuration file, that is created after first launch.
* Semi localization support: Any phrase that isn't hardcoded can be translated trough lang files.
* Flexible script launching: Can launch desired python scripts with user preferences from java commands.
* Download and Rename any Crunchyroll show's subtitle files (Show must be available for free users).

## Plans for future releases:

* Decryption of RTMP stream urls trough python.
* Dumping of these streams into flv container through usage of RTMPDump library.
* Extraction of said flv containers into video and audio.
* Repackaging of Video Audio and if present, the subtitles into a mkv container.
* Flexible and multi-purpose GUI design.
* More viable translation support (remove currently hardcoded elements).
* Clarify/crop copied python scripts (already worked on the decoder) to make them more responsive with java.
* Rewrite old modules and make new modules for extended capabilities.
* Crunchyroll cookie saver module.


## Requirements:

### Compilation:
----------------
* JDK 1.7 or higher (http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)
* Apache Maven (http://maven.apache.org/) or other build environment (gradle or ant preferred).

### Running:
----------------
* Internet Connection
* JRE7 or Higher
* Python 2.6 or Higher ( < 3.x.x )
 
