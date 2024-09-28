import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push the opening brackets into the stack
            if (ch == '[' || ch == '(' || ch == '{') {
                st.push(ch);
            }
            // Check for matching closing brackets and pop if valid
            else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
            // If none of the conditions match, return false
            else {
                return false;
            }
        }

        // If the stack is empty, all brackets were valid, otherwise false
        return st.isEmpty();
    }
}


/*

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

*/
