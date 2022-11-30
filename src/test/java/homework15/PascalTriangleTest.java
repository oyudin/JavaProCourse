package homework15;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTest {


    @Test
    public void generateTriangleTest() {

        PascalTriangle pascalTriangle = new PascalTriangle();

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstNumber = new ArrayList<>();
        firstNumber.add(1);

        List<Integer> secondNumbers = new ArrayList<>();
        secondNumbers.add(1);
        secondNumbers.add(1);

        List<Integer> thirdNumbers = new ArrayList<>();
        thirdNumbers.add(1);
        thirdNumbers.add(2);
        thirdNumbers.add(1);

        result.add(firstNumber);
        result.add(secondNumbers);
        result.add(thirdNumbers);

        Assert.assertEquals(result, pascalTriangle.generateTriangle(3));

    }


}
