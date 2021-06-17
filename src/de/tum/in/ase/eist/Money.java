package de.tum.in.ase.eist;

import java.util.Objects;

public class Money {

	private final int amount;
	private final Currency currency;

	public Money(int amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public int amount() {
		return amount;
	}

	public Currency currency() {
		return currency;
	}

	public Money add(Money money) {
		// TODO Task 1: what happens if the currencies are different?
		if (this.currency != money.currency()) {
			throw new IllegalArgumentException("Different currencies not supported!");
		}
		return new Money(amount() + money.amount(), currency());
	}

	public Money subtract(Money money) {
		// TODO Task 1: implement this method
		if (this.currency != money.currency()) {
			throw new IllegalArgumentException("Different currencies not supported!");
		}
		return new Money(amount() - money.amount(), currency());
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Money other = (Money) obj;
		return amount == other.amount && currency == other.currency;
	}
}
