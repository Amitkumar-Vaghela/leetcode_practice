import java.util.*;

public class Solution {
    public boolean makeEqual(String[] words) {
        // Create a frequency map to store the count of each character
        int[] charCount = new int[26];
        int n = words.length;

        // Count the frequency of each character across all the words
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
        }

        // Check if each character count can be evenly divided by the number of words
        for (int count : charCount) {
            if (count % n != 0) {
                return false;
            }
        }

        // If we reach here, it means we can make all strings equal
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String[] words1 = {"abc", "aabc", "bc"};
        System.out.println(solution.makeEqual(words1)); // Output: true

        String[] words2 = {"ab", "a"};
        System.out.println(solution.makeEqual(words2)); // Output: false
    }
}
