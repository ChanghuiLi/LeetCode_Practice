package 面试前必看;

public class 最长公共子串与最长公共子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "helloworld";
		String s2 = "loop";
		System.out.println(Solution(s1,s2));
		System.out.println(Solution2(s1,s2));

	}
	//最长公共子串，连续：dp[i][j]表示以该元素结尾的最大公共子串长度。
	//dp[i][j] = dp[i-1][j-1]+1 s[i] ==s[j]
	//dp[i][j] = 0 s[i]!=s[j]
	public static String Solution(String s1,String s2) {
		if(s1==null||s2==null) return null;
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		//初始化dp[i][0] = 0;dp[0][j] = 0;
		int res = 0;
		int x = 0;
		int y = 0;
		for(int i = 1;i<=s1.length();i++) {
			for(int j = 1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
					if(dp[i][j]>res) {
						x = i;
						y = j;
					}
					res = Math.max(dp[i][j], res);
					
				}
			}
		}
		
		//如果要返回最长公共子串（连续的话）只需要找到dp矩阵中最大的元素值，向前搜索。
		int m1 = x, m2 = y;
		while(m1>=1&&m2>=1&&s1.charAt(m1-1)==s2.charAt(m2-1)) {
			m1--;
			m2--;
		}
		return s1.substring(m1, x);
	}
	//最长公共子序列，非连续：dp[i][j]表示1到以元素结尾的最大公共子序列长度。
	//dp[i][j] = dp[i-1][j-1]+1 s[i] ==s[j]
	//dp[i][j] = max（dp[i][j-1],dp[i-1][j]） s[i]!=s[j]
	public static String Solution2(String s1,String s2) {
		if(s1==null||s2==null) return null;
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		//初始化dp[i][0] = 0;dp[0][j] = 0;
		int res = 0;
		for(int i = 1;i<=s1.length();i++) {
			for(int j = 1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
					
				}
				else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		
		int m1 = s1.length();
		int m2 = s2.length();
		String out = "";
		while(m1>=1&&m2>=1) {
			if(s1.charAt(m1-1)!=s2.charAt(m2-1)) {
				while(dp[m1][m2-1] == dp[m1][m2]) {
					m2--;
				}
				while(dp[m1-1][m2]==dp[m1][m2]) {
					m1--;
				}
				
			}else {
				out = out + s1.charAt(m1-1);
				m1--;
				m2--;
			}
		}
		
		
		return out;
	}

}
