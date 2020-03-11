class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Base cases
       if (matrix.length == 0 || matrix[0].length == 0)
           return new ArrayList<Integer>();
        
        List<Integer> spiral = new ArrayList<>();
        
        spiralMatrix(spiral, matrix, 0, matrix.length-1, 0, matrix[0].length-1);
        
        return spiral;
    }
    
    public void spiralMatrix(List<Integer> spiral, int[][] matrix, int firstRow, int lastRow, int firstColumn, int lastColumn) {
        // Check to see if we have run out of bounds
        if (firstRow > lastRow || firstColumn > lastColumn) 
            return;
        
        // Top row: left to right
        for (int i = firstColumn; i <= lastColumn; i++) {
            spiral.add(matrix[firstRow][i]);
        }
        // Last column: top to bottom
        for (int i = firstRow + 1; i <= lastRow; i++) {
            spiral.add(matrix[i][lastColumn]);
        }
        // Check if we have processsed the last row or column 
        if (firstRow == lastRow || firstColumn == lastColumn) {
          return;
      }
        //Bottom row: right to left
        for (int i = lastColumn - 1; i >= firstColumn; i--) {
            spiral.add(matrix[lastRow][i]);
        }
        //First column: bottom to top
        for (int i = lastRow - 1; i >= firstRow + 1; i--) {
            spiral.add(matrix[i][firstColumn]);
        }
        // Recursion for bigger matrices
        spiralMatrix(spiral, matrix, firstRow+1, lastRow-1, firstColumn+1, lastColumn-1);
    }
}
