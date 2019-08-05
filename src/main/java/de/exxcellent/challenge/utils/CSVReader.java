package de.exxcellent.challenge.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;


public class CSVReader<R> {
	
	final Class<R> typeParameterClass;

    public CSVReader(Class<R> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }
	
	public List<R>  read(String path) throws IllegalStateException, FileNotFoundException {
		
		return new CsvToBeanBuilder<R>(new FileReader("src/main/resources/de/exxcellent/challenge/"+path)).withType(typeParameterClass).build().parse();
		
	}

}
