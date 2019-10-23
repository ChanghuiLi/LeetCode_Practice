import java.util.Scanner;

public class duxiaoman2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int W = in.nextInt();
	    int[] t = new int[N+1];
	    int[] w = new int[N+1];
	    for(int i = 1;i<=N;i++) {
	    	t[i] = in.nextInt();
	    }
	    for(int i = 1;i<=N;i++) {
	    	w[i] = in.nextInt();
	    }
	    int res = 0;
	    int[][] dp = new int[N+1][N+1];
	    
	    //dp[i][j] = Math.min(dp[i-1][j+1],
	    for(int i = 1;i<=N;i++) {
	    	res = res + t[i];
	    }
	    System.out.println(res);

	}

}
