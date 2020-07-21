class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int size = rows * cols;
        int count = 0;
        int max = 0;
      
        int[] dp = new int[size+1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0) {
                    dp[count] = matrix[i][j] - '0';
                    count++;
                } else if (matrix[i][j] == '0') {
                      dp[count] = 0;
                    count++;
                } else {
                    dp[count] = Math.min(Math.min(dp[count-cols],dp[count-1]), dp[count-cols-1]) + 1;
                    count++;
                }
                System.out.println(dp[count-1]);
                max = Math.max(dp[count-1], max);
            }
        }
        
        return max*max;
    }
}
