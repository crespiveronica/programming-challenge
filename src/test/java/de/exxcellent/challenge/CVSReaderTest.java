package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.models.Team;
import de.exxcellent.challenge.models.Weather;
import de.exxcellent.challenge.utils.CSVReader;

class CVSReaderTest {

	@Test
	void testWeather() throws IllegalStateException, FileNotFoundException {
		
		List<Weather> testWeathers = new ArrayList<Weather>();
		testWeathers.add(new Weather(1, 59, 88));
		testWeathers.add(new Weather(2, 63, 79));
		testWeathers.add(new Weather(3, 55, 77));
		testWeathers.add(new Weather(4, 59, 77));
		testWeathers.add(new Weather(5, 66, 90));
		
		List<Weather> weathers =  new CSVReader(Weather.class).read("weather.csv");
		assertArrayEquals(testWeathers.toArray(), weathers.subList(0, 5).toArray());
	}
	
	@Test
	void testFootball() throws IllegalStateException, FileNotFoundException {
		
		List<Team> testTeams = new ArrayList<Team>();
		testTeams.add(new Team("Arsenal", 79, 36));
		testTeams.add(new Team("Liverpool", 67, 30));
		testTeams.add(new Team("Manchester United", 87, 45));
		testTeams.add(new Team("Newcastle", 74, 52));
		testTeams.add(new Team("Leeds", 53, 37));
		
		List<Team> weathers = new CSVReader(Team.class).read("football.csv");
		assertArrayEquals(testTeams.toArray(), weathers.subList(0, 5).toArray());
	}

}
