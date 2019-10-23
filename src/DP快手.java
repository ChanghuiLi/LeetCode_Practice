import java.util.Scanner;

public class DP快手 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int[] nums = new int[N];
	    for(int i = 0;i<nums.length;i++) {
	    	nums[i] = in.nextInt();
	    }
	    int[][] dp = new int[N+1][N+1];
	    for(int i = 1;i<N+1;i++) {
	    	dp[i][i] = nums[i-1];
	    }
	    for(int i = 2;i<=N;i++) {
	    	for(int j = 1;j<=N-i+1;j++) {
	    		int k = j+i-1;
	    		dp[j][k] = Integer.MAX_VALUE;
	    		for(int m = j;m<=k-1;m++) {
	    			int q = helper(dp[j][m],dp[m+1][k]);
	    			dp[j][k] = Math.min(dp[j][k], q);
	    		}
	    		
	    	}
	    	Math.pow
	    }
	    for(int i = 0;i<=N;i++) {
	    	for(int j = 0;j<=N;j++) {
	    		System.out.print(dp[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println(dp[1][N]);
	}

	private static int helper(int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {
			return 0;
		}else {
			return Math.abs(i-j);
		}
	}

}
