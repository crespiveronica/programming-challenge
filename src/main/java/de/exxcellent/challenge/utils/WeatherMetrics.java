package de.exxcellent.challenge.utils;

import java.util.List;

import de.exxcellent.challenge.models.Weather;

public class WeatherMetrics {
	public static Weather minTempSpread(List<Weather> weathers) {
		
		return weathers.stream()
						.min((w1, w2) -> Integer.compare( w1.getTempSpread(), w2.getTempSpread()))
						.get();
	}

}
