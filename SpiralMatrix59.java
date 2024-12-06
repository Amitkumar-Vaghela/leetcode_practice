




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


