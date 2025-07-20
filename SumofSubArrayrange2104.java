public class SubarrayRanges {

    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0;

        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            int j = i + 1;
            while (j < n) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                total += (max - min);
                j++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        SubarrayRanges s = new SubarrayRanges();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3, 3};

        System.out.println("Output for [1, 2, 3]: " + s.subArrayRanges(nums1)); // Output: 4
        System.out.println("Output for [1, 3, 3]: " + s.subArrayRanges(nums2)); // Output: 4
    }
}




// Example 1:

// Input: nums = [1,2,3]
// Output: 4
// Explanation: The 6 subarrays of nums are the following:
// [1], range = largest - smallest = 1 - 1 = 0 
// [2], range = 2 - 2 = 0
// [3], range = 3 - 3 = 0
// [1,2], range = 2 - 1 = 1
// [2,3], range = 3 - 2 = 1
// [1,2,3], range = 3 - 1 = 2
// So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.


