package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar)object;
        return this.amount == dollar.amount;
    }
}
