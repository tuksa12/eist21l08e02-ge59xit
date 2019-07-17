package de.tum.in.ase.eist;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class MoneyTest {

	private final Money m12CHF = new Money(12, Currency.CHF);
	private final Money m14CHF = new Money(14, Currency.CHF);

	@Test
	void testSimpleAdd() {
		Money expected = new Money(26, Currency.CHF);
		Money observed = m12CHF.add(m14CHF);

		// TODO Task 2: implement the assertion
		fail("Test case not implemented yet");
	}

	@Test
	void testSimpleSubtract() {
		// TODO Task 3: implement the test case
		fail("Test case not implemented yet");
	}

	@Test
	void testInvalidAdd() {
		Money m14USD = new Money(14, Currency.USD);

		// TODO Task 4: implement the test case
		fail("Test case not implemented yet");
	}
}
