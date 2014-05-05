package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public class Money {
    // TODO-sin: Money rounding?
    protected int amount;

    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // TODO-sin: hashCode()
    // TODO-sin: Equal null
    // TODO-sin: Equal object
    public boolean equals(Object object) {
        Money money = (Money)object;
        return this.amount == money.amount
                && this.currency().equals(money.currency());
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

    public Money plus(Money addend) {
        return new Money(amount + addend.amount, currency());
    }
}
