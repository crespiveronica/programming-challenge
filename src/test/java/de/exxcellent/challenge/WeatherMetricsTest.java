package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.models.Weather;
import de.exxcellent.challenge.utils.WeatherMetrics;

class WeatherMetricsTest {

	@Test
	void testMinTempSpread() {
		//TODO store in a test database
		List<Weather> test_weathers = new ArrayList<Weather>();
		test_weathers.add(new Weather(1, 59, 88));
		Weather minSpread = new Weather(2, 63, 79);
		test_weathers.add(minSpread);
		test_weathers.add(new Weather(3, 55, 77));
		test_weathers.add(new Weather(4, 59, 77));
		test_weathers.add(new Weather(5, 66, 90));
		Weather minSpreadWeather = WeatherMetrics.minTempSpread(test_weathers);
		assertEquals(minSpread, minSpreadWeather);
	}

}
