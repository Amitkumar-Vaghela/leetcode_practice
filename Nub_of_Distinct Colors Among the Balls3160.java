import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] result = new int[queries.length];
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // If the ball has been colored before, decrement the count of its current color
            if (ballToColor.containsKey(ball)) {
                int currentColor = ballToColor.get(ball);
                colorCount.put(currentColor, colorCount.get(currentColor) - 1);
                if (colorCount.get(currentColor) == 0) {
                    colorCount.remove(currentColor);
                }
            }

            // Assign the new color to the ball
            ballToColor.put(ball, color);

            // Increment the count of the new color
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            // The number of distinct colors is the size of the colorCount map
            result[i] = colorCount.size();
        }

        return result;
    }
}
