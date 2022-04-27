package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlackjackTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Begining testing suite.");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("\nBegining next test.");
	}

	@Test
	void testBothPlayersEqualInput() {
		int actual = Blackjack.play(12, 12);
		int expected = 0;
		System.out.println("Testing both players having the same input.");
		System.out.println("Expected result: " + expected);
		System.out.println("Actual result: " + actual);
		assertEquals(expected, actual, "The test between equal inputs failed.");
	}
	
	@Test
	void testBothPlayersInputZero() {
		int actual = Blackjack.play(0,  0);
		int expected = 0;
		System.out.println("Testing both okayers entering 0 as input.");
		System.out.println("Expected result: " + expected);
		System.out.println("Actual result: " + actual);
		assertEquals(expected, actual, "The test between inputs of 0 failed.");
	}

	@AfterEach
	void afterEach() {
		System.out.println("End of test.");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("\nTesting complete, closing suite.");
	}
}
