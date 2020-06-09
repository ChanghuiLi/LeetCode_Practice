package 递归与动态规划;

public class 机器人达到指定位置方法数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//核心是定义状态dp[i][j] = 方法数，i还剩下几步，j是当前位置。
	public int Way(int len,int B,int P,int S) {
		int[][] dp = new int[B+1][len+1];
		dp[0][P] = 1;
		for(int i = 1; i <= B; i++) {
			for(int j = 1; j < len; j++) {
				if(j == 1) {
					dp[i][j] = dp[i-1][2];
				}else if(j == len) {
					dp[i][j] = dp[i-1][len-1];
				}else {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
				}
			}
		}
		return dp[B][S];
	}

}
