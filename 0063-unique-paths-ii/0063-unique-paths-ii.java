// Approach -1 Memorization
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] dp = new int [n][m];
        for(int [] i : dp) Arrays.fill(i,-1);

        return solve(n-1,m-1,obstacleGrid,dp);        
    }
    int solve(int n, int m, int [][] obstacleGrid, int [][]dp){

        if(n>=0 && m>=0 && obstacleGrid[n][m] ==1) return 0;

        if(n<0 || m<0) return 0;

        if(n==0 && m==0) return 1;

        if(dp[n][m]!=-1) return dp[n][m];

        int l = solve(n-1,m,obstacleGrid,dp);
        int d = solve(n,m-1,obstacleGrid,dp);
        return dp[n][m] = l+d;
    }
}