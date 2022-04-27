package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseFactorialTest {
@BeforeAll
static void beforeAll() {
	System.out.println("Opening testing Suite.");
}

@BeforeEach
void beforeEach() {
	System.out.println("\nBegining next test.");
}

@Test
void test0() {
	String expected = "NONE";
	String actual = ReverseFactorial.find(0);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 0.");
}

@Test
void test1() {
	String expected = "0!";
	String actual = ReverseFactorial.find(1);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 1.");
}

@Test
void test120() {
	String expected = "5!";
	String actual = ReverseFactorial.find(120);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 120.");
}

@Test
void test121() {
	String expected = "NONE";
	String actual = ReverseFactorial.find(121);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 121.");
}

@Test
void test150() {
	String expected = "NONE";
	String actual = ReverseFactorial.find(150);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 150.");
}

@Test
void test720() {
	String expected = "6!";
	String actual = ReverseFactorial.find(720);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 720.");
}

@Test
void test479001600() {
	String expected = "12!";
	String actual = ReverseFactorial.find(479001600);
	System.out.println("Expected result: " + expected + "\nActual Result: " + actual);
	assertEquals(expected, actual, "Test failed with input 479001600.");
}

@AfterEach
void afterEach() {
	System.out.println("End of test.");
}

@AfterAll
static void afterAll() {
	System.out.println("Testing complete, closing suite.");
}

}
