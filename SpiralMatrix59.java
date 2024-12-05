class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;

        while (left <= right && top <= bottom) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Fill bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Fill left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
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


