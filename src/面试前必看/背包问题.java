package 面试前必看;

public class 背包问题 {
	public static int Bag01(int[] w,int[] v,int bag) {
		//定义状态：前i件物品放在容积为j的包里最大价值
		int[][] dp = new int[w.length+1][bag+1];
		for(int i = 1;i<=w.length;i++) {
			for(int j = 1;j<=bag;j++) {
				if(w[i]<=j) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+w[i]);
				}
			}
		}
		return dp[w.length][bag];
		//helpa
		
		//也可以用一位数组来存：dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
	}
	
	
	//完全背包问题；算法2
	public static int ComBag(int[] w,int[] v,int bag) {
		int[] dp = new int[bag+1];
		for(int i = 1;i<w.length+1;i++) {
			for(int j = w[i];j<bag+1;j++) {
				dp[j] = Math.max(dp[j], dp[j-w[j]+v[j]]);
			}
		}
		return dp[bag];
		
	}
	//多重背包问题：类似于0-1背包，和完全背包，需要限制物品的数目K
	//dp[i][j] = Math.max{dp[i-1][j-k*w[j]]+k*v[j],.....},K从1-n[i]
	public static int MutiBag(int[] w,int[] v,int bag) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
