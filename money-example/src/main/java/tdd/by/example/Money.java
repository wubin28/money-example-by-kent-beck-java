package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public class Money {
    // TODO-sin: Money rounding?
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money)object;
        // TODO-sin: Currency?
        return this.amount == money.amount
                && this.getClass().equals(money.getClass());
    }
}
