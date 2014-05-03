package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public abstract class Money {
    // TODO-sin: Money rounding?
    protected int amount;

    // TODO-sin: hashCode()
    // TODO-sin: Equal null
    // TODO-sin: Equal object
    public boolean equals(Object object) {
        Money money = (Money)object;
        // TODO-working-on: Currency?
        return this.amount == money.amount
                && this.getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public abstract Money times(int multiplier);

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract String currency();
}
