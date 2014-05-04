package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar extends Money {
    private String currency;
    // TODO-sin: Dollar/Franc duplication

    public Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    // TODO-sin: Common times
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
