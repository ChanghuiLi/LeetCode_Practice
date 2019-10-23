package DP;

public class P62UniquePath {
	public int uniquePaths(int m, int n) {
        //初始化：
		int[][] dp = new int[m][n];
		for(int i =0;i<m;i++) {
			dp[i][0] = 1;
		}
		for(int i =0;i<n;i++) {
			dp[0][n] = 1;
		}
		//
		for(int j = 1;j<m;j++) {
			for(int k = 1; k<n;k++) {
				dp[j][k] = dp[j-1][k]+dp[j][k-1];
			}
		}
		return dp[m-1][n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
