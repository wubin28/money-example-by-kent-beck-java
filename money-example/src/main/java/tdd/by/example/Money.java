package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money)object;
        return this.amount == money.amount;
    }
}
