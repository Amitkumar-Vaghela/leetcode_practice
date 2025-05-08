import java.util.Scanner; 
import java.util.Stack;   

public class ParenthesesChecker {

   
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  // Stack to store opening brackets

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Get character at each position

            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check if it matches the last opening bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;  // No matching opening bracket

                char top = stack.pop();  // Pop the top opening bracket

                // Check if the popped opening bracket matches the closing one
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;  // Mismatched pair
                }
            }
        }

        // At the end, stack should be empty if all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input

        // Ask user to enter a string
        System.out.print("Enter a string with parentheses: ");
        String input = scanner.nextLine();  // Read full line input from user

        // Call the isValid method and print result
        boolean result = isValid(input);
        System.out.println("Is valid: " + result);  // true or false

        scanner.close();  // Close the scanner to free resources
    }
}



// output

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

// Example 4:
// Input: s = "([])"
// Output: true
