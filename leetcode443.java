//String Compression

class Solution {
    public int compress(char[] chars) {
        int count = 1; // Initialize count to 1 for counting consecutive characters
        StringBuilder sb = new StringBuilder(); // Create an empty StringBuilder
        
        sb.append(chars[0]); // Add the first character to StringBuilder

        for (int i = 1; i < chars.length; i++) { // Traverse through the chars array starting from the second element
            if (chars[i - 1] != chars[i]) { // If the current character is different from the previous one
                if (count > 1) {
                    sb.append(count); // Append the count if more than 1
                }
                sb.append(chars[i]); // Append the current character
                count = 1; // Reset the count
            } else {
                count++; // If the characters are the same, increment the count
            }
        }

        // After the loop, handle the last group of characters
        if (count > 1) {
            sb.append(count);
        }

        // Write the compressed result back into the original array
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length(); // Return the length of the compressed string
    }
}
