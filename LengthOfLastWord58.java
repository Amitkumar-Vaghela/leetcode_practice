class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}


/*

      Example 1 :
Input:
   "Hello World"
Output:
    5

      Example 2:
Input:
" fly me to the moon "

Output:
4

     Example 3:
Input:
"luffy is still joyboy"

Output:
6

  */












  
