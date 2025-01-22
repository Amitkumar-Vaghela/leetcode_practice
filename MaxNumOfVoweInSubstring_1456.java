class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
