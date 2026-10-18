class Solution {
    int MOD = 1000000007;
    
    public int dfs(int r, int c, int m, int n, int maxMove, int[][][] dp){
        if(r < 0 || r>=m || c<0 || c>=n) return 1;
        if(maxMove == 0) return 0;
        if(dp[r][c][maxMove] >= 0 ) return dp[r][c][maxMove];
        int sum =  ((dfs(r-1, c, m, n, maxMove-1, dp) + 
        dfs(r+1, c, m, n, maxMove-1, dp))% MOD +
        (dfs(r, c+1, m, n, maxMove-1, dp) +
        dfs(r, c-1, m, n, maxMove-1, dp))%MOD) % MOD;
        dp[r][c][maxMove] = sum;
        return sum;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
         for (int[][] rows : dp) {
            for (int[] cols : rows) {
                java.util.Arrays.fill(cols, -1);
            }
        }
        return dfs(startRow, startColumn, m, n, maxMove, dp);
    }
}
