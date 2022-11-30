package homework15;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generateTriangle(int numRows) {

        List<List<Integer>> finalResult = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        finalResult.add(firstRow);
        if (numRows == 1) {
            return finalResult;
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> elements = new ArrayList<>();
            elements.add(1);

            for (int j = 1; j < i; j++) {
                elements.add(finalResult.get(i - 1).get(j - 1) + finalResult.get(i - 1).get(j));
            }
            elements.add(1);
            finalResult.add(elements);
        }

        return finalResult;
    }
}