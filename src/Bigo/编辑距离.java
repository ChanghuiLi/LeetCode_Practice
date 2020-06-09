package Bigo;

public class 编辑距离 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int Distance(String str1,String str2) {
		//DP初始化：dp[i][j]表示str1【1-】变化到str2[1-j]两个子串的边际距离。
		int m = str1.length();
		int n = str2.length();
		int[][] dp = new int[m+1][n+1];
		//初始化
		for(int i = 0; i < dp.length; i++) {
			dp[i][0] = i;
		}
		for(int j = 0; j < dp[0].length; j++) {
			dp[0][j] = j;
		}
		//当前元素不相等：max(dp[i,j-1]+1, dp[i-1,j]+1, dp[i-1,j-1]+1)
		
		for(int i = 1; i < dp.length; i++) {
			for(int j = 1; j < dp[0].length; j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					dp[i][j] = dp[i-1][j-2];
				}else {
					dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
				}
				
			}
		}
		return dp[m][n];
		
	}

}
