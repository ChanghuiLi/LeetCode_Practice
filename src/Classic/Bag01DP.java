package Classic;

import java.util.Scanner;
//0-1背包有总价值最大。
//int c[maxn],w[maxn],dp[maxv];
public class Bag01DP {
	public static void main(String[] args){
        int[] a = {2,3,4,5,6,7};
        int[] b = {3,4,5,6,9,7};
        int bag = 10;
        int[][] temp = Bag01(a,b,bag);
        for(int i = 0;i<temp.length;i++) {
        	for(int j = 0;j<temp[0].length;j++) {
        		System.out.print(temp[i][j]);
        	}
        	System.out.println(" ");
        }
        int[] set = Bag01onedemension(a,b,bag);
        
        
    }

	private static int[][] Bag01(int[] w, int[] v,int b) {
		int[][] dp = new int[w.length+1][b+1];
		for(int i = 1;i<=w.length;i++) {
			for(int j = 1;j<=b;j++) {
				if(j<w[i-1]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.max(dp[i-1][j-w[i-1]]+v[i-1], dp[i-1][j]);
				}
				
			}
		}
		return dp;
	}
	private static int[] Bag01onedemension(int[] w, int[] v,int b){
		int[] dp = new int[b+1];
		for(int i = 0;i<w.length;i++) {
			for(int j = b;j>=w[i];j--) {
				if(j>=w[i]) {
					dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
				}
				
			}
			System.out.println("__________");
			for(int m = 0;m<=b;m++) {
	        	System.out.print(dp[m]);
	        }
		}
		return dp;
	}
	

	
}
