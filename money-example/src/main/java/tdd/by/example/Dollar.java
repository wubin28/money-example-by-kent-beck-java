package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar extends Money {

    // TODO-sin: Dollar/Franc duplication

    public Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    // TODO-sin: Common times
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
