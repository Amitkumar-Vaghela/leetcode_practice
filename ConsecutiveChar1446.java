class Solution {
    public int maxPower(String s) {

    int count = 1;
    int max = 1;

        for(int i=1; i<s.length(); i++){
            char curr = s.charAt(i);        // current 
            char prev = s.charAt(i - 1);   // previous

            if(curr == prev){
                count++;
            }else{
                max = Math.max(max , count);
                 count = 1;
            }
        }
        max = Math.max(max , count);
        return max;
        
    }
}

/*
Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
*/
