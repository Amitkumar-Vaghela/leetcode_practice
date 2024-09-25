class Solution {
    public int pivotIndex(int[] nums) {
       // rightsum 
        int Rsum = 0;
        for(int ele : nums){
            Rsum += ele;
        }

        // leftsum
        int Lsum = 0;
        for(int i = 0; i < nums.length; i++){
            Rsum -= nums[i];

          // check first both sum are equall or not 
            if(Rsum == Lsum){
                return i;
            }
           // if not equal than add in leftsum and i will pass to next 
           Lsum += nums[i];
        }

       return -1;  //Return the leftmost pivot index. If no such index exists, return -1

        
    }
}
