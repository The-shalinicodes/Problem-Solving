class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int Ones = 0;
            int Zeroes = 0;
            for (char c : str.toCharArray()) {
                if (c == '0')
                    Zeroes++;
                else
                    Ones++;
            }
            for (int i = m; i >= Zeroes; i--) {
                for (int j = n; j >= Ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - Zeroes][j - Ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
}