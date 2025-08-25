import java.util.*;

public class CelebrityProblem {
    
    // Function to check if person a knows person b
    static boolean knows(int[][] M, int a, int b) {
        return M[a][b] == 1;
    }

    static int celebrity(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();
        
        // Step 1: Push all people in stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        
        // Step 2: Eliminate non-celebrities
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            
            if (knows(M, a, b)) {
                st.push(b); // a cannot be celebrity
            } else {
                st.push(a); // b cannot be celebrity
            }
        }
        
        // Step 3: Possible celebrity
        int candidate = st.pop();
        
        // Step 4: Verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (knows(M, candidate, i) || !knows(M, i, candidate)) {
                    return -1;
                }
            }
        }
        
        return candidate;
    }
    
    public static void main(String[] args) {
        int[][] M = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        int n = 3;
        System.out.println(celebrity(M, n)); // Output: 1
    }
}
