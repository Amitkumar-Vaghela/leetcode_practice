
import java.util.Arrays;
public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);  // Sort people by weight
        int left = 0;  // Lightest person
        int right = people.length - 1;  // Heaviest person
        int boats = 0;  // Number of boats
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;  // Pair the lightest with the heaviest
            }
            right--;  // Always take the heaviest person
            boats++;  // One boat used
        }
        
        return boats;  // Minimum number of boats required
    }
}

/*

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)

*/
 
