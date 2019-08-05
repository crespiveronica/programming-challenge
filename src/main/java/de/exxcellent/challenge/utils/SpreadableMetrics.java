package de.exxcellent.challenge.utils;

import java.util.List;

import de.exxcellent.challenge.models.Spreadable;

public class SpreadableMetrics {
	public static Spreadable minTempSpread(List<Spreadable> spreadables) {
		
		return spreadables.stream()
						.min((s1, s2) -> Integer.compare( s1.getSpread(), s2.getSpread()))
						.get();
	}

}
