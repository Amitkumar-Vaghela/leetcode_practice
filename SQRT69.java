class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; // Base cases

        int start = 1, end = x, result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the perfect square root
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                result = mid; // Store potential answer
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
