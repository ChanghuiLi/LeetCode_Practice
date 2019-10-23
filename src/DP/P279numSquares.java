package DP;

public class P279numSquares {
	public static int numSquares(int n) {
        if(n < 1) return 0;
        if(n <= 3) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int tempmin;
        for(int i = 4;i<=n;i++) {
        	tempmin = Integer.MAX_VALUE/2;
        	for(int k=1;(i-k)>=0;k = k*k) {
        		if(i-(k*k)==0) {
        			tempmin = 1;
        			
        			break;
        		}
        		tempmin = Math.min(dp[(i-k)]+1, tempmin);
        		
        		k++;
        	}
        	System.out.println(tempmin);
        	dp[i] = tempmin;
        }
        
        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSquares(13));
	}

}
