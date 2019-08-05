package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.models.Spreadable;
import de.exxcellent.challenge.models.Team;
import de.exxcellent.challenge.models.Weather;
import de.exxcellent.challenge.utils.SpreadableMetrics;

class SreadableMetricsTest {

	@Test
	void testMinTempSpread() {
		//TODO store in a test database
		List<Spreadable> test_weathers = new ArrayList<Spreadable>();
		test_weathers.add(new Weather(1, 59, 88));
		Weather minSpread = new Weather(2, 63, 79);
		test_weathers.add(minSpread);
		test_weathers.add(new Weather(3, 55, 77));
		test_weathers.add(new Weather(4, 59, 77));
		test_weathers.add(new Weather(5, 66, 90));
		Spreadable minSpreadWeather = SpreadableMetrics.minTempSpread(test_weathers);
		assertEquals(minSpread, minSpreadWeather);
	}
	
	@Test
	void testMinGoalsSpread() {
		//TODO store in a test database
		List<Spreadable> testTeams = new ArrayList<Spreadable>();
		testTeams.add(new Team("Arsenal", 79, 36));
		testTeams.add(new Team("Liverpool", 67, 30));
		testTeams.add(new Team("Manchester United", 87, 45));
		testTeams.add(new Team("Newcastle", 74, 52));
		Team minSpread = new Team("Leeds", 53, 37);
		testTeams.add(minSpread);
		Spreadable minSpreadWeather = SpreadableMetrics.minTempSpread(testTeams);
		assertEquals(minSpread, minSpreadWeather);
	}

}
