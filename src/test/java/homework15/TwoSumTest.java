package homework15;

import org.junit.*;

public class TwoSumTest {

    @Test
    public void TwoSumTest() {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 4, 6, 12};
        int target = 10;

        int[] expectedNumbers = new int[2];
        expectedNumbers[0] = 1;
        expectedNumbers[1] = 2;

        Assert.assertArrayEquals(expectedNumbers, twoSum.twoSum(nums, target));
    }
}
