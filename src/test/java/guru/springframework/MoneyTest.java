package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {

        Money five =  Money.dollar(5);
        //I create this object here so that assign the amount seperately, otherwise it's gonna be immutable
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15),five.times(3));

        Money fivef =  Money.franc(5);
        //I create this object here so that assign the amount seperately, otherwise it's gonna be immutable
        assertEquals(Money.franc(10), fivef.times(2));
        assertEquals(Money.franc(15),fivef.times(3));

    }

    @Test
    void testEqualityDollar() {

        //I create two different objects, that's why their objects not equal, it fails, I create a boolean in the class
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(Money.dollar(5), Money.franc(5));

    }

    @Test
    void testCurrency() {

        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());

    }

    @Test
    void testSimpleAddition() {

        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);

    }
}
