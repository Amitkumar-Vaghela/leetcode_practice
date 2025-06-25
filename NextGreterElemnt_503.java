import java.util.*;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from the end towards the beginning (2n - 1 to 0)
        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n]; // Circular index

            // Pop smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // Only assign result in the first round (i < n)
            if (i < n) {
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            // Push current element into stack
            stack.push(current);
        }

        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 1};
        int[] output = sol.nextGreaterElements(nums);

        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(output));
    }
}



int[] nums = {1, 2, 1};



Input:  [1, 2, 1]
Output: [2, -1, 2]
