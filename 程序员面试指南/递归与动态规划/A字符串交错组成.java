package 递归与动态规划;

public class A字符串交错组成 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "AB";
		String str2 = "12";
		String aim = "BA12";
		System.out.println(Solution(str1,str2,aim));

	}
	//定义dp状态：dp[i][j] = Str1【0-》i-1】，Str2【0-》j-1】能否组成aim【0，i+j-1】
	public static boolean Solution(String str1,String str2,String aim) {
		
		boolean[][] dp = new boolean[str1.length()+1][str2.length()+1];
		dp[0][0] = true;
		for(int i = 1; i <= str2.length();i++) {
			if(str2.charAt(i-1)!=aim.charAt(i-1)) {
				break;
			}
			dp[0][i] = true;
		}
		for(int i = 1; i <= str1.length();i++) {
			if(str1.charAt(i-1)!=aim.charAt(i-1)) {
				break;
			}
			dp[i][0] = true;
		}
		
		for(int i = 1; i <= str1.length();i++) {
			for(int j =1; j <=str2.length();j++) {
				if((str1.charAt(i-1)==aim.charAt(i+j-1)&&dp[i-1][j])||
						(str2.charAt(j-1)==aim.charAt(i+j-1)&&dp[i][j-1])) {
					dp[i][j] = true;
				}
			}
		}
		
		return dp[str1.length()][str2.length()];
	}

}
