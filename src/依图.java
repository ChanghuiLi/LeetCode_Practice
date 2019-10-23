import java.util.Arrays;
import java.util.Scanner;

public class 依图 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<nums.length;i++) {
			nums[i] = in.nextInt();
		}
		int[] dp = new int[100000];
		
		dp[0] = 2;
		dp[1] = 7;
		for(int i = 2;i<nums.length;i++) {
			double temp = (double)(dp[i-1]*dp[i-1])/(double)dp[i-2];
			dp[i] = (int) Math.floor(temp+0.5);
		}
		for(int i = 0;i<nums.length;i++) {
			System.out.println(dp[nums[i]-1]);
		}

	}

}
