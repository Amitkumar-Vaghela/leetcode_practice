class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int count = 1;

        // Define variable boundaries
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (count <= n * n) {
            // Traverse from left to right on the top row
            for (int i = minCol; i <= maxCol; i++) {
                arr[minRow][i] = count;
                count++;
            }
            minRow++; // Move top boundary down

            // Traverse from top to bottom on the rightmost column
            for (int j = minRow; j <= maxRow; j++) {
                arr[j][maxCol] = count;
                count++;
            }
            maxCol--; // Move right boundary left

            // Traverse from right to left on the bottom row
            if (minRow <= maxRow) {
                for (int k = maxCol; k >= minCol; k--) {
                    arr[maxRow][k] = count;
                    count++;
                }
                maxRow--; // Move bottom boundary up
            }

            // Traverse from bottom to top on the leftmost column
            if (minCol <= maxCol) {
                for (int l = maxRow; l >= minRow; l--) {
                    arr[l][minCol] = count;
                    count++;
                }
                minCol++; // Move left boundary right
            }
        }
        return arr;
    }
}





/*



1>
Input: n = 3
Output: 
         [1,2,3],
         [8,9,4],
         [7,6,5]   ]
         

2>
Input: n = 1
Output: [[1]]


3> 
input: n =2
output : 

*/

 public static void main(String[] args) {
        SpiralMatrixII solution = new SpiralMatrixII();
        int n = 4; // Change the value of n to test with different inputs
        int[][] result = solution.generateMatrix(n);

        // Print the result matrix
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


// input : n = 4
// output : 

// 1  2  3  4
// 12 13 14  5
// 11 16 15  6
// 10  9  8  7


