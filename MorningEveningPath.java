import java.util.Scanner;

public class Main {
    public static int[] calculateDistances(int n, int[][] m) {
        // Morning DP for max path
        int[][] maxDP = new int[n][n];
        maxDP[0][0] = m[0][0];

        for (int i = 1; i < n; i++) {
            maxDP[i][0] = maxDP[i - 1][0] + m[i][0];
            maxDP[0][i] = maxDP[0][i - 1] + m[0][i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                maxDP[i][j] = Math.max(maxDP[i - 1][j], maxDP[i][j - 1]) + m[i][j];
            }
        }

        // Night DP for min path
        int[][] minDP = new int[n][n];
        minDP[n - 1][n - 1] = m[n - 1][n - 1];

        for (int i = n - 2; i >= 0; i--) {
            minDP[i][n - 1] = minDP[i + 1][n - 1] + m[i][n - 1];
            minDP[n - 1][i] = minDP[n - 1][i + 1] + m[n - 1][i];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                minDP[i][j] = Math.min(minDP[i + 1][j], minDP[i][j + 1]) + m[i][j];
            }
        }

        return new int[]{maxDP[n - 1][n - 1], minDP[0][0]};
    }

    // Do not edit this part of code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = scanner.nextInt();
            }
        }

        int[] result = calculateDistances(n, m);
        System.out.println(result[0] + " " + result[1]);
    }
}






/*


Input:
3
4 9 2
1 10 7
12 8 3


Output:
34 25



*/
