class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                // Check the left and right plots
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i == length - 1 || flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    // Plant a flower here
                    flowerbed[i] = 1;
                    count++;
                    
                    // Skip the next plot
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        
        return count >= n;
    }
}

/*
int[] flowerbed = {1, 0, 0, 0, 1};
int n = 1;


true
*/
