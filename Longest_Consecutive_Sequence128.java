import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums); // Sort the array
        int longest = 1;
        int currentStreak = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) { // Skip duplicates
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longest = Math.max(longest, currentStreak);
                    currentStreak = 1; // Reset streak
                }
            }
        }

        return Math.max(longest, currentStreak); // Return the maximum streak
    }
}
