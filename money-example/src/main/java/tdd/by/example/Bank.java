package tdd.by.example;

/**
 * Created by benwu on 14-5-6.
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        if (source instanceof Money) return (Money)source.reduce(to);
        Sum sum = (Sum)source;
        return sum.reduce(to);
    }
}
