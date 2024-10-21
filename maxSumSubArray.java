// MaxSum of SubArray in Array 

class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize current sum and max sum with the first element
        int currSum = nums[0];
        int maxSum = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update current sum by either adding the current element or starting a new subarray from this element
            currSum = Math.max(currSum + nums[i], nums[i]);

            // Update max sum if the current sum is larger
            maxSum = Math.max(maxSum, currSum);
        }

        // Return the maximum subarray sum
        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call maxSubArray and print the result
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}


// result will be 
/*
Given the input array nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the algorithm works as follows:

Initial: currSum = -2, maxSum = -2
i = 1: currSum = max(-2 + 1, 1) = 1, maxSum = max(-2, 1) = 1
i = 2: currSum = max(1 + (-3), -3) = -2, maxSum = max(1, -2) = 1
i = 3: currSum = max(-2 + 4, 4) = 4, maxSum = max(1, 4) = 4
i = 4: currSum = max(4 + (-1), -1) = 3, maxSum = max(4, 3) = 4
i = 5: currSum = max(3 + 2, 2) = 5, maxSum = max(4, 5) = 5
i = 6: currSum = max(5 + 1, 1) = 6, maxSum = max(5, 6) = 6
i = 7: currSum = max(6 + (-5), -5) = 1, maxSum = max(6, 1) = 6
i = 8: currSum = max(1 + 4, 4) = 5, maxSum = max(6, 5) = 6 
*/

// Maximum subarray sum is: 6


