// Find Target Indices After Sorting Array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int numLess = 0; // Number of elements less than target
        int tCount = 0;  // Number of occurrences of target

        for (int ele : nums) {
            if (ele < target) {
                numLess++;
            } else if (ele == target) {
                tCount++;
            }
        }

        // Now make a list for storing the result indices
        List<Integer> ans = new ArrayList<>();
        while (tCount > 0) {
            ans.add(numLess);
            numLess++;
            tCount--;
        }

        return ans;
    }
}
