public class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String result = "";
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (Character.isDigit(currentChar)) {
                // Build the full number
                num = num * 10 + (currentChar - '0');
            } else if (currentChar == '[') {
                // Push the number and current result to their respective stacks
                numberStack.push(num);
                stringStack.push(result);
                
                // Reset num and result for the new block
                num = 0;
                result = "";
            } else if (currentChar == ']') {
                // Pop from the stacks and repeat the string
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeatTimes = numberStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(result);
                }
                result = temp.toString();
            } else {
                // Append current character to the result
                result += currentChar;
            }
        }

        return result;
    }
}
