package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar extends Money {

    // TODO-sin: Dollar/Franc duplication

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    // TODO-sin-working-on: Common times
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}
