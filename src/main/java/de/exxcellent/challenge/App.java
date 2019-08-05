package de.exxcellent.challenge;

import java.io.FileNotFoundException;
import java.util.List;

import de.exxcellent.challenge.models.Spreadable;
import de.exxcellent.challenge.models.Weather;
import de.exxcellent.challenge.utils.CSVReader;
import de.exxcellent.challenge.utils.SpreadableMetrics;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {
	
	static void weather(String path) {
		try {
			List<Spreadable> weathers = new CSVReader(Weather.class).read(path);
			String dayWithSmallestTempSpread = SpreadableMetrics.minTempSpread(weathers).getIdentification();
	        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

		} catch (IllegalStateException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("Unable to read weather.csv file");
			e.printStackTrace();
		}
	}

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

    		weather("weather.csv");
		
        
        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
