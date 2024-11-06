import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        int sum = 0;

        // Sum up every other element starting from the first one
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition ap = new ArrayPartition();
        int[] nums = {1, 4, 3, 2};
        System.out.println("Maximized Sum: " + ap.arrayPairSum(nums)); // Output should be 4
    }
}


/*
Example 1:

Input: nums = [1,4,3,2]
Output: 4


Explanation: All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.
*/
