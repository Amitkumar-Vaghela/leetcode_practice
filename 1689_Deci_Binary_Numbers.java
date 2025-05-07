import java.util.Scanner;

public class Solution {
    public int minPartitions(String N) {
        int maxDigit = 0;

        // Use a simple for loop with index
        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0'; // Convert character to integer
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            // Early exit if digit is 9
            if (maxDigit == 9) break;
        }

        return maxDigit;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number as a string: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        int result = sol.minPartitions(input);

        System.out.println("Minimum number of deci-binary numbers: " + result);
        sc.close();
    }
}




// output
//Enter the number as a string: 82734
//Minimum number of deci-binary numbers: 8
