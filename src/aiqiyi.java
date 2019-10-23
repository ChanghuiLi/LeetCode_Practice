import java.util.Scanner;

public class aiqiyi {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int N, M;
        
        while(in.hasNextInt())
        {
          N = in.nextInt();
          M = in.nextInt();
          double res = helperDP(N,M);
        }

	}

	private static double helperDP(int n, int m) {
		// TODO Auto-generated method stub
		double[][] dp = new double[n+1][m+1];
		//实现DP
		//初始化
		for(int i = 0;i<dp.length;i++) {
			dp[i][0] = 1;
		}
		for(int i = 0;i<dp[0].length;i++) {
			dp[0][i] = 0;
		}
		for(int i = 1;i<dp.length;i++) {
			for(int j = 1;j<dp[0].length;j++) {
				dp[i][j] = ((double)j/(double)(i+j))*((double)(j-1)/(double)(i+j-1))*(dp[i-1][m-2]+dp[i][j-3]);
			}
		}
		return dp[n][m];
	}

}
