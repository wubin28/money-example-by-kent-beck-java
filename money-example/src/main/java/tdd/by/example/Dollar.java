package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar extends Money {
    // TODO-working-on: Dollar/Franc duplication

    public Dollar(int amount) {
        this.amount = amount;
    }

    // TODO-sin: Common times
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
