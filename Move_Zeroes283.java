class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;  // Index for non-zero elements
        
        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Fill the rest of the array with zeros
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
