package homework15;

public class Main {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 4, 6, 12};
        int target = 10;
        twoSum.twoSum(nums, target);


        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.getFibNumbersSum(8));


        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generateTriangle(4));

    }
}
