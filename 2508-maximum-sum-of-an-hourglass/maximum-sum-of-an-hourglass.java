class Solution {
    public int maxSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxHourglassSum = 0;
      for (int centerRow = 1; centerRow < rows - 1; centerRow++) {
        for (int centerCol = 1; centerCol < cols - 1; centerCol++) {
            int currentHourglassSum = -grid[centerRow][centerCol - 1] - grid[centerRow][centerCol + 1];
            for (int row = centerRow - 1; row <= centerRow + 1; row++) {
                    for (int col = centerCol - 1; col <= centerCol + 1; col++) {
                        currentHourglassSum += grid[row][col];
                    }
                }
               maxHourglassSum = Math.max(maxHourglassSum, currentHourglassSum);
            }
        }
      
        return maxHourglassSum;

        
    }
}