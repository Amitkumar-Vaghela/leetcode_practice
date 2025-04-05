import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int nSquared = n * n;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map with counts of each number in the grid
        for (int[] row : grid) {
            for (int num : row) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        int repeated = -1;
        int missing = -1;

        // Iterate over the range [1, n^2] to find the repeated and missing numbers
        for (int i = 1; i <= nSquared; i++) {
            int count = frequencyMap.getOrDefault(i, 0);
            if (count == 2) {
                repeated = i;
            } else if (count == 0) {
                missing = i;
            }
            // If both numbers are found, no need to continue the loop
            if (repeated != -1 && missing != -1) {
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}
