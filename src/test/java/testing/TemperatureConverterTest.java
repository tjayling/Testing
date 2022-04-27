package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.DecimalFormat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

	static DecimalFormat df;

	@BeforeAll
	static void beforeClass() {
//		df = new DecimalFormat("#");
		System.out.println("Starting testing suite.");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("\nBegining new test.");
	}

	@Test
	void testConvertFahrenheitToCelsius() {
		System.out.println("Testing Farenheight to Celcius");
		TemperatureConverter tc = new TemperatureConverter();
		float actual = Math.round(tc.convertFahrenheitToCelsius(89));
		float expected = 32f;
		System.out.println("Expected output: " + expected);
		System.out.println("Actual output: " + actual);
		assertEquals(expected, actual, "Farenheight to Celcius conversion failed");
	}

	@Test
	void testConvertCelciusToFahrenheit() {
		System.out.println("Testing Celcius to Farenheight");
		TemperatureConverter tc = new TemperatureConverter();
		float actual = Math.round(tc.convertCelsiusToFahrenheit(89));
		float expected = 192f;
		System.out.println("Expected output: " + expected);
		System.out.println("Actual output: " + actual);
//		assertEquals(expected, actual, "Farenheight to Celcius conversion failed");
		assertTrue(expected == actual, "Celcius to Farenheight conversion failed");
	}

	@Test
	void testConvertKelvinToCelsius() {
		System.out.println("Testing Kelvin to Celsius");
		TemperatureConverter tc = new TemperatureConverter();
		float actual = Math.round(tc.convertKelvinToCelsius(282));
		float expected = 9f;
		System.out.println("Expected output: " + expected);
		System.out.println("Actual output: " + actual);
		assertEquals(expected, actual, "Farenheight to Celcius conversion failed");
	}

	@Test
	void testConvertCelsiusToKelvin() {
		System.out.println("Testing Celcius to Kelvin");
		TemperatureConverter tc = new TemperatureConverter();
		float actual = Math.round(tc.convertCelsiusToKelvin(89));
		float expected = 362f;
		System.out.println("Expected output: " + expected);
		System.out.println("Actual output: " + actual);
		assertEquals(expected, actual, "Celcius to Kelvin conversion failed");
	}
	
	@Test
	void testConvertKelvinToFahrenheit() {
		System.out.println("Testing Kelvin to Fahrenheit");
		TemperatureConverter tc = new TemperatureConverter();
		float actual = Math.round(tc.convertKelvinToFahrenheit(89));
		float expected = -299f;
		System.out.println("Expected output: " + expected);
		System.out.println("Actual output: " + actual);
		assertEquals(expected, actual, "Kelvin To Fahrenheit conversion failed");
	}
	
	@Test
	void testConvertFahrenheitToKelvin() {
		System.out.println("Testing Fahrenheit to Kelvin");
		TemperatureConverter tc = new TemperatureConverter();
		float actual = Math.round(tc.convertFahrenheitToKelvin(89));
		float expected = 305f;
		System.out.println("Expected output: " + expected);
		System.out.println("Actual output: " + actual);
		assertEquals(expected, actual, "Fahrenheit to Kelvin conversion failed");
	}
}
