package de.exxcellent.challenge.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import de.exxcellent.challenge.models.Weather;

public class CSVReader {
	
	public static List<Weather>  read(String path) throws IllegalStateException, FileNotFoundException {
		
		return new CsvToBeanBuilder<Weather>(new FileReader("src/main/resources/de/exxcellent/challenge/"+path)).withType(Weather.class).build().parse();
		
	}

}
