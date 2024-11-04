public class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1); // Remove the last character
                }
            } else {
                result.append(c); // Add character to result
            }
        }
        
        return result.toString();
    }
}
