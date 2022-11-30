package homework15;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

    @Test
    public void getFibNumbersSumTest() {

        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        int expectedValue = 21;

        Assert.assertEquals(expectedValue, fibonacciNumber.getFibNumbersSum(8));

    }

}
