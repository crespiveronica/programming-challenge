package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import de.exxcellent.challenge.models.Weather;
import de.exxcellent.challenge.utils.CSVReader;

class CVSReaderTest {

	@Test
	void test_weather() throws IllegalStateException, FileNotFoundException {
		
		List<Weather> test_weathers = new ArrayList<Weather>();
		test_weathers.add(new Weather(1, 59, 88));
		test_weathers.add(new Weather(2, 63, 79));
		test_weathers.add(new Weather(3, 55, 77));
		test_weathers.add(new Weather(4, 59, 77));
		test_weathers.add(new Weather(5, 66, 90));
		
		List<Weather> weathers =  CSVReader.read("weather.csv");
		assertArrayEquals(test_weathers.toArray(), weathers.subList(0, 5).toArray());
	}

}
