
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
 
