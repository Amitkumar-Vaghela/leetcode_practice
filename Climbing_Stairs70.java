class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n; // Base cases: 1 step = 1 way, 2 steps = 2 ways
        }

        int first = 1; // Number of ways to reach step 1
        int second = 2; // Number of ways to reach step 2

        // Iteratively calculate the number of ways to reach higher steps
        for (int i = 3; i <= n; i++) {
            int current = first + second; // Ways to reach the current step
            first = second;              // Update for the next iteration
            second = current;
        }

        return second; // Result is stored in 'second'
    }
}
