package homework15;

public class FibonacciNumber {

    public int getFibNumbersSum(int a) {
        if (a == 0 || a == 1) return a;
        return getFibNumbersSum(a - 1) + getFibNumbersSum(a - 2);

    }
}
