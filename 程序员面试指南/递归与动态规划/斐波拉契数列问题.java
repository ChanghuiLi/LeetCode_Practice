package 递归与动态规划;

public class 斐波拉契数列问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution(5));
	}
	//初始化的问题，或者状态转移方程的问题。从第一个状态开始定义。
	public static int Solution(int year) {
		if(year<=0) return 0;
		else if(year<=2) return year;
		int[] dp = new int[year+1];
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 3;
		for(int i = 3;i<=year;i++) {
			dp[i] = dp[i-1]+dp[i-3];
		}
		return dp[year-1];
	}

}
