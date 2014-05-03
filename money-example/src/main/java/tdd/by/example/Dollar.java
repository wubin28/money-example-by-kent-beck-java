package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money money = (Money)object;
        return this.amount == money.amount;
    }
}
