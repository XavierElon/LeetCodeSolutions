class Solution {
    public int orangesRotting(int[][] grid) {
        int freshCount = 0;
        
        Queue<Integer> rottenOranges = new ArrayDeque<>();
        int rowCount = grid.length;
        int colCount = grid[0].length;
        
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j <colCount; j++) {
                if (grid[i][j] == 1) freshCount++;
                else if (grid[i][j] == 2) rottenOranges.add(i * colCount + j);
            }
        }
        
        int minNumber = 0;
        
        while (freshCount != 0 && !rottenOranges.isEmpty()) {
            int size = rottenOranges.size();
            
            for (int i = 0; i < size; i++) {
                int rottenPos =  rottenOranges.poll();
                int row = rottenPos / colCount;
                int col = rottenPos % colCount;
                
                if (row - 1 >= 0 && grid[row-1][col] == 1) {
                    rottenOranges.add((row-1) * colCount + col);
                    grid[row-1][col] = 2;
                    freshCount--;
                }
                if (row + 1 < rowCount && grid[row+1][col] == 1) {
                    rottenOranges.add((row+1) * colCount + col);
                    grid[row+1][col] = 2;
                    freshCount--;
                }
                if (col - 1 >= 0 && grid[row][col-1] == 1) {
                    rottenOranges.add((row) * colCount + col-1);
                    grid[row][col-1] = 2;
                    freshCount--;
                }
                if (col + 1 < colCount && grid[row][col+1] == 1) {
                    rottenOranges.add((row) * colCount + col+1);
                    grid[row][col+1] = 2;
                    freshCount--;
                }
            }
            minNumber++;
        }
        return freshCount == 0 ? minNumber : -1;
    }
}
