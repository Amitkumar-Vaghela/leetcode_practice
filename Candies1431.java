// Kids With the Greatest Number of Candies  1431

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        
        // Find the maximum number of candies any child currently has
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        // Check if each child can have the greatest number of candies after getting extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
}
