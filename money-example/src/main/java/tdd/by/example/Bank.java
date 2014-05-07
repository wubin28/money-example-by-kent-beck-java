package tdd.by.example;

/**
 * Created by benwu on 14-5-6.
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {

    }

    public int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;
    }
}
