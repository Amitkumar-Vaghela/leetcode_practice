import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        solve(0, board, solutions, n);
        return solutions;
    }
    
    private void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            solutions.add(construct(board));
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q'; // Place the queen
                solve(row + 1, board, solutions, n); // Recur to place the rest of the queens
                board[row][col] = '.'; // Backtrack
            }
        }
    }
    
    private boolean isSafe(int row, int col, char[][] board, int n) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        
        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        
        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        
        return true;
    }
    
    private List<String> construct(char[][] board) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }
}
