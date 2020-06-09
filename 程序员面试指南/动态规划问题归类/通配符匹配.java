package 动态规划问题归类;

public class 通配符匹配 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// dp[i][j] = dp[i-1][j-1] if str1[i] = str2[j] ||str1,str2==?
	public static boolean Solution(String str1,String str2) {
		boolean[][] dp = new boolean[str1.length()+1][str2.length()+1];
		dp[0][0] = true;
		for(int i = 1;i<=str1.length();i++) {
			if(str1.charAt(i-1)=='*') {
				int j = 1;
				while(!dp[i-1][j-1]&&j<str2.length()+1) j++;
				dp[i][j-1] = dp[i-1][j-1];
				while(j<str2.length()+1) dp[i++][j++] = true;
			}else if(str1.charAt(i-1)=='?') {
				for(int j = 1;j<str2.length()+1;j++) {
					dp[i][j] = dp[i-1][j-1];
				}
			}else {
				for(int j = 1;j<str2.length()+1;j++) {
					dp[i][j]= dp[i-1][j-1]&&str1.charAt(i) == str2.charAt(j);
				}
			}
		}
		return dp[str1.length()][str2.length()];
	}

}
