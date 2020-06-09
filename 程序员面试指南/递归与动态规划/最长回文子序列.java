package 递归与动态规划;

public class 最长回文子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "cbbd";
		System.out.println(Solution(a));

	}
	//dp[i][j] = dp[i+1][j-1]+2;
	//dp[i][j] = Math.max[dp[i+1][j],d[i][j-1]]
	public static int Solution(String s) {
		int[][] dp = new int[s.length()][s.length()];
		for(int i = 0;i<s.length();i++) {
			dp[i][i] = 1;
		}
		for(int j = 1;j<s.length();j++) {
			for(int i = j-1;i>=0;i--) {
				if(s.charAt(i)==s.charAt(j)) {
					dp[i][j] = dp[i+1][j-1]+2;
				}else {
					dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
				}
			}
		}
		return dp[0][s.length()-1];
	}

}
