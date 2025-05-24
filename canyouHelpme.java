/*
1>Can you Help Him ?

Problem Statement:

Hanish has recently got a internship. He likes travelling in the morning but hates travelling in the night. 
While going to office in the morning from his home he wants to cover as much distance as possible and while returning back to home in the night from office he want to cover as less distance as possible.
The city in which Hanish lives can be represented as a two dimensional square matrix of size N. Hanish home is located at (1,1) and office at (N,N). 
While going to office Hanish can move from position (i,j) to (i+1,j) or (i,j+1) and while returning back he can move from position (i,j) to (i-1,j) or (i,j-1).
The value of the matrix at position (i,j) represent the time needed to cover than area.

Input Explanation:
First line contain a integer N(size of the matrix). Then N lines follow, each containing N space separated integers.

Output Explanation:
Two space separated integer (maximum time taken while travelling in the morning and minimum time taken while travelling in the night)

Constraints:
1 <= N <= 20 1 <= Values in the matrix <= 1000

Time Limit:
1 sec

Example 1:
Input
5
1 2 3 4 5
10 9 8 7 6
1 1 1 1 1
6 7 8 9 10
5 4 3 2 1

Output
57 27

Example 2:
Input
3
4 9 2
1 10 7
12 8 3

Output
34 25

Example 3:
Input
2
4 9
22 10

Output
36 23
 
*/


import java.util.Scanner;

public class Main {
    public static int[] calculateDistances(int n, int[][] m) {
        int[][] maxTime = new int[n][n];
        int[][] minTime = new int[n][n];

        maxTime[0][0] = m[0][0];
        for (int i = 1; i < n; i++) {
            maxTime[i][0] = maxTime[i-1][0] + m[i][0];
            maxTime[0][i] = maxTime[0][i-1] + m[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                maxTime[i][j] = Math.max(maxTime[i-1][j], maxTime[i][j-1]) + m[i][j];
            }
        }

        
        minTime[n-1][n-1] = m[n-1][n-1];
        for (int i = n - 2; i >= 0; i--) {
            minTime[i][n-1] = minTime[i+1][n-1] + m[i][n-1];
            minTime[n-1][i] = minTime[n-1][i+1] + m[n-1][i];
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                minTime[i][j] = Math.min(minTime[i+1][j], minTime[i][j+1]) + m[i][j];
            }
        }

        return new int[] { maxTime[n-1][n-1], minTime[0][0] };
    }

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



