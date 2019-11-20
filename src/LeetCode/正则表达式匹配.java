package LeetCode;

public class 正则表达式匹配 {
//动态规划算法
	//正则表达式匹配的动态规划方程：
	//定义状态：dp[i][j] :s长度i与p长度j是否能够匹配。
//	如果 p.charAt(j) == s.charAt(i) : dp[i][j] = dp[i-1][j-1]；
//			如果 p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1]；
//			如果 p.charAt(j) == '*'：
//			如果 p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2] //in this case, a* only counts as empty
//			如果 p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.'：
//			dp[i][j] = dp[i-1][j] //in this case, a* counts as multiple a
//			or dp[i][j] = dp[i][j-1] // in this case, a* counts as single a
//			or dp[i][j] = dp[i][j-2] // in this case, a* counts as empty

	public boolean isMatch(String s, String p) {
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
