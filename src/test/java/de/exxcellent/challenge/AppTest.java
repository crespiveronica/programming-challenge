package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public class AppTest {

    @Test
    public void testFootball() {
    		final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        App.main("--football", "football.csv");
        assertEquals("Team with smallest goal spread       : Aston_Villa\n", output.toString());
    }
    
    @Test
    public void testWeather() {
    		final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        App.main("--weather", "weather.csv");
        assertEquals("Day with smallest temperature spread : 14\n", output.toString());
    }
    
    @Test
    public void testNoopl() {
    		final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        App.main("--lala", "football.csv");
        assertEquals("", output.toString());
    }

}