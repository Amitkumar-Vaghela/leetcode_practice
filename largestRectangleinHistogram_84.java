import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];
        Stack<Integer> st = new Stack<>();

        // Find nearest smaller to left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                leftSmall[i] = 0;
            else
                leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        // Clear stack
        st.clear();

        // Find nearest smaller to right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty())
                rightSmall[i] = n - 1;
            else
                rightSmall[i] = st.peek() - 1;
            st.push(i);
        }

        // Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }

        return maxArea;
    }
}



// Input: heights = [2,1,5,6,2,3]
// Output: 10
// Explanation: The above is a histogram where width of each bar is 1.
// The largest rectangle is shown in the red area, which has an area = 10 units.
