import java.util.*;

class Solution {
    public void merge(long[] arr1, long[] arr2, int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                } else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                } else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    private void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        long[] arr1 = {1, 4, 7, 8, 10};
        long[] arr2 = {2, 3, 9};
        sol.merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
