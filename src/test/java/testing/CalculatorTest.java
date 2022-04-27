package testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@BeforeAll
	static void testStart() {
		System.out.println("Starting test suite.");
	}
	
	@BeforeEach
	void newTest() {
		System.out.println("\nRunning next test.");
	}

	@Test
	void test_5_3_15() {
		String expected = "5*3=15, or 15/3=5, or 15/5=3";
		String actual = Calculator.relationships(new Integer[] {5, 3, 15});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 5, 3, 15 failed");
	}
	
	@Test
	void test_4_2_8() {
		String expected = "4*2=8, or 8/2=4, or 8/4=2";
		String actual = Calculator.relationships(new Integer[] {4, 2, 8});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 4, 2, 8 failed");
	}
	
	@Test
	void test_6_2_12() {
		String expected = "6*2=12, or 12/2=6, or 12/6=2";
		String actual = Calculator.relationships(new Integer[] {6, 2, 12});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 6, 2, 12 failed");
	}
	
	@Test
	void test_6_2_3() {
		String expected = "3*2=6, or 6/2=3, or 6/3=2";
		String actual = Calculator.relationships(new Integer[] {6, 2, 3});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 6, 2, 3 failed");
	}
	
	@Test
	void test_9_12_108() {
		String expected = "12*9=108, or 108/9=12, or 108/12=9";
		String actual = Calculator.relationships(new Integer[] {9, 12, 108});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 9, 12, 108 failed");
	}

	@Test
	void test_4_16_64() {
		String expected = "16*4=64, or 64/4=16, or 64/16=4";
		String actual = Calculator.relationships(new Integer[] {4, 16, 64});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 4, 16, 64 failed");
	}
	
	@Test
	void test_7_14_98() {
		String expected = "14*7=98, or 98/7=14, or 98/14=7";
		String actual = Calculator.relationships(new Integer[] {7, 14, 98});
		System.out.println("Expected result: " + expected + "\nActual result: " + actual);
		assertTrue(expected.equals(actual), "Test 7, 14, 98 failed");
	}
	
	@AfterEach
	void endOfTest() {
		System.out.println("End of test.");
	}
	
	
	@AfterAll
	static void testEnd() {
		System.out.println("Closing test suite.");
	}

}
