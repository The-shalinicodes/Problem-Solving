class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int negativeCount = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int value = matrix[i][j];
                totalSum += Math.abs(value);
                if (value < 0) {
                    negativeCount++;
                }
                minValue = Math.min(minValue, Math.abs(value));
            }
        }
        if (negativeCount % 2 == 0) {
            return totalSum;
        } else {
            return totalSum - (2 * minValue);
        }
    }
}