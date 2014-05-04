package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
