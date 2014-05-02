package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount = amount * multiplier;

    }
}
