import java.util.*;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, "", 0, result);
        return result;
    }

    private void backtrack(String s, int index, String current, int parts, List<String> result) {
        if (parts == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1)); // Remove last dot
            return;
        }

        if (parts > 4 || index >= s.length()) return;

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);
            if (isValid(segment)) {
                backtrack(s, index + len, current + segment + ".", parts + 1, result);
            }
        }
    }

    private boolean isValid(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) return false; // No leading zeros
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }
}


/*
 

Example 1:
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
Example 2:

Input: s = "0000"
Output: ["0.0.0.0"]
Example 3:

Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 

Constraints:
1 <= s.length <= 20
s consists of digits only.


*/
