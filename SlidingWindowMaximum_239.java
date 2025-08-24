import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) return new int[0];
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices, values decreasing

        for (int i = 0; i < n; i++) {
            // 1) Remove smaller/equal elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            // 2) Add current index
            dq.offerLast(i);

            // 3) Remove front if it's out of this window (left boundary = i - k + 1)
            int left = i - k + 1;
            if (dq.peekFirst() < left) {
                dq.pollFirst();
            }

            // 4) Record answer once the first window is complete
            if (i >= k - 1) {
                ans[left] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}



// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7


// Example 2:
// Input: nums = [1], k = 1
// Output: [1]




