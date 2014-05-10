package tdd.by.example;

/**
 * Created by benwu on 14-5-6.
 */
public class Sum implements Expression{
    public Expression augend;
    public Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    // TODO-sin: Sum.plus
    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
