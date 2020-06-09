package 面试前必看;

public class 最长回文子串DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//定义状态函数：dp(i,j)表示s[i—>j]是不是回文子串。
	
	public static String Solution(String s) {
		if(s==null||s.length()==0) return null;
		if(s.length()==1) return s;
		int[][] dp = new int[s.length()][s.length()];
		//初始化
		for(int i = 0;i<s.length();i++) {
			dp[i][i] = 1;
			if(i < s.length()-1) {
				if(s.charAt(i)==s.charAt(i+1)) {
					dp[i][i+1] = 1;
				}
			}
		}
		int start = 0;
		int len = 0;
		for(int l=3;l<=s.length();l++) {//子串长度
			for(int i = 0;i+l-1<s.length();i++) {//起始点枚举
				int j = i+l-1;//终点
				if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1) {
					dp[i][j] = 1;
					start = i;
					len = l;
				}
				
			}
		}
		return s.substring(start, start+len);
	}

}
