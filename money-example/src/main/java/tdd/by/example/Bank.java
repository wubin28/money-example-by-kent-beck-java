package tdd.by.example;

/**
 * Created by benwu on 14-5-6.
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        Sum sum = (Sum)source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }
}
