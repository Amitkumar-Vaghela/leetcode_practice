import java.util.Arrays;
import java.util.ArrayList;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort by start time
        ArrayList<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (!merged.isEmpty() && merged.get(merged.size() - 1)[1] >= interval[0]) {
                // Merge intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            } else {
                // Add new interval
                merged.add(interval);
            }
        }

        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
