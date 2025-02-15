public class Solution {
    public int punishmentNumber(int n) {
        int totalPunishment = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(Integer.toString(square), 0, i)) {
                totalPunishment += square;
            }
        }
        return totalPunishment;
    }

    private boolean canPartition(String s, int start, int target) {
        if (start == s.length()) {
            return target == 0;
        }
        int num = 0;
        for (int i = start; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > target) {
                break;
            }
            if (canPartition(s, i + 1, target - num)) {
                return true;
            }
        }
        return false;
    }
}
