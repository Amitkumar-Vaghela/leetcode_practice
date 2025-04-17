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



