package 递归与动态规划;

public class A数字字符串可以转化为字母组合的总数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "120";
		System.out.println(Solution2(str));

	}
	
	public static int Solution(String str) {
		char[] chas = str.toCharArray();
		return process(chas,0);
	}

	private static int process(char[] chas, int i) {
		// TODO Auto-generated method stub
		if(i==chas.length) {
			return 1;
		}
		if(chas[i] == '0') {
			return 0;
		}
		int res = process(chas,i+1);
		if(i+1<chas.length&&(chas[i]-'0')*10+chas[i+1]-'0'<27) {
			res += process(chas,i+2);
		}
		return res;
	}
	
	public static int Solution2(String str) {
		char[] chas = str.toCharArray();
		int[] dp = new int[chas.length];
		dp[str.length()-1] = chas[chas.length-1]=='0'?0:1;
		if(str.length()>=2&&(chas[str.length()-2]-'0')*10+chas[str.length()-1]-'0'<27) {
			if(dp[str.length()-1]==0) {
				dp[str.length()-2] = 1;
			}else {
				dp[str.length()-2] = 2;
			}
		}
		for(int j = chas.length-3; j >= 0; j--) {
			if(chas[j]=='0') {
				dp[j] = dp[j+1];
			}else {
				if((chas[j]-'0')*10+chas[j+1]-'0'<27) {
					dp[j] = dp[j+1]+dp[j+2];
				}
			}
		}
		return dp[0];
	}

}
