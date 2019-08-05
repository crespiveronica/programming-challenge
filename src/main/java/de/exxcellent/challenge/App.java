package de.exxcellent.challenge;

import java.io.FileNotFoundException;
import java.util.List;

import de.exxcellent.challenge.models.Spreadable;
import de.exxcellent.challenge.models.Team;
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
			System.out.printf("Unable to read %s file", path);
			e.printStackTrace();
		}
	}
	

	static void football(String path) {
		try {
			List<Spreadable> teams = new CSVReader(Team.class).read(path);
			String teamWithSmallestGoalSpread = SpreadableMetrics.minTempSpread(teams).getIdentification();
	        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
		} catch (IllegalStateException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.printf("Unable to read %s file", path);
			e.printStackTrace();
		}
	}


    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

    		weather("weather.csv");
    		
    		football("football.csv");
		
    }
}
