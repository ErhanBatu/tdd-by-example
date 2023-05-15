package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {

        Dollar five =  new Dollar(5);
        //I create this object here so that assign the amount seperately, otherwise it's gonna be immutable
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15,product.amount);

    }

    @Test
    void testEquality() {

        //I create two different objects, that's why their objects not equal, it fails, I create a boolean in the class
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));

    }
}
