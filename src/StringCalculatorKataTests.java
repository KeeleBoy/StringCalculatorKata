import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalculatorKataTests {

	@Test
	void testEmpty() {
		int actual = StringCalculatorKata.add("");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testIntPos() {
		int actual = StringCalculatorKata.add("1");
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void testIntNeg() {
		int actual = StringCalculatorKata.add("-1");
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	void testSpace() {
		int actual = StringCalculatorKata.add(" ");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testLowerCaseLetter() {
		int actual = StringCalculatorKata.add("k");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testUpperCaseLetter() {
		int actual = StringCalculatorKata.add("K");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testTwoNumbers() {
		int actual = StringCalculatorKata.add("2,2");
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	void numberAndLetter() {
		int actual = StringCalculatorKata.add("2,k");
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	void twoNegatives() {
		int actual = StringCalculatorKata.add("-2,-2");
		int expected = -4;
		assertEquals(expected, actual);
	}

	@Test
	void threeLettersAndFourNumbers() {
		int actual = StringCalculatorKata.add("1k,1e,1j,1");
		int expected = 4;
		assertEquals(expected, actual);
	}
	@Test
	void negativesAndPositives() {
		int actual = StringCalculatorKata.add("2,-2");
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	void fiveNumbers() {
		int actual = StringCalculatorKata.add("2,2,2,2,2");
		int expected = 10;
		assertEquals(expected, actual);
	}

}
