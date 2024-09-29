
// 921. Minimum Add to Make Parentheses Valid

class Solution {
    public int minAddToMakeValid(String s) {

      Stack<Character> st = new Stack<>(); // make stack

        int count = 0;

        for (int i = 0; i < s.length(); i++) { // click out character
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (!st.isEmpty() && st.peek() == '(') {
                // in case of ) closing tag
                st.pop(); // if match condi then takeout the char from stack
            } else {
                count++; // if not match above condition then add in count
           
            }

        }
            count += st.size(); 
            return count;
    }

    }



/*



Example 1:
Input: s = "())"
Output: 1

Example 2:
Input: s = "((("
Output: 3






*/
