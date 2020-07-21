class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        
        // First row
        for (int i = 1; i < columns; i++) {
            grid[0][i] += grid[0][i-1];
        }
        // First column
        for (int j = 1; j < rows; j++) {
            grid[j][0] += grid[j-1][0];
        }
        
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[rows-1][columns-1];
    }
}
