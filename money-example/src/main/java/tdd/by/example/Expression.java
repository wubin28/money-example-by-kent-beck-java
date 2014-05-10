package tdd.by.example;

/**
 * Created by benwu on 14-5-6.
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);

    // TODO-sin-working-on: Expression.times
}
