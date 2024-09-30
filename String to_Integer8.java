public class Solution {
    public int myAtoi(String s) {
        // Step 1: Remove leading and trailing whitespace
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        // Step 2: Initialize variables
        int index = 0, sign = 1, result = 0;
        int n = s.length();

        // Step 3: Check for optional sign
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        // Step 4: Convert string to integer
        while (index < n
