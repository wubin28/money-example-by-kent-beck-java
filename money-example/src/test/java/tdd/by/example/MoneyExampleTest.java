package tdd.by.example;

/**
 * Created by benwu on 14-5-2.
 */
public class MoneyExampleTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
