package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
