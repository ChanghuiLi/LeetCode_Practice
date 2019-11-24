package 面试前必看;

public class 背包问题 {
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
        
        for(int i = 0;i<set.length;i++) {
        	
        }
        int[] temp2 = ComBag(a,b,bag);
        for(int i = 0;i<temp2.length;i++) {
        	System.out.print(temp2[i]);
        }
        
        
    }
	private static int[] Bag01onedemension(int[] w, int[] v, int bag) {
		// TODO Auto-generated method stub
		
		int[] dp = new int[bag+1];
		for(int i = 0;i<w.length;i++) {
			for(int j = bag;j>=1;j--) {//注意要从后往前推
				if(j>=w[i]) {
					dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
				}
				
			}
		}
		return dp;
	}
	public static int[][] Bag01(int[] w,int[] v,int bag) {
		//定义状态：前i件物品放在容积为j的包里最大价值
		//建立一个二维数组来dp[i][j]
		//一件物品会存在放和不放的问题：dp[i][j] = dp[i-1][j](不放），dp[i-1][j-w[i]]+v[i]]
		int[][] dp = new int[w.length+1][bag+1];
		for(int i = 1;i<=w.length;i++) {
			for(int j = 1;j<=bag;j++) {
				if(w[i-1]<=j) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i-1]]+v[i-1]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp;
		//helpa
		
		//也可以用一位数组来存：dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
	}
	
	
	//完全背包问题；一件物品可以放很多次
	public static int[] ComBag(int[] w,int[] v,int bag) {
		//初始化状态dp[i][j]
		
		int[] dp = new int[bag+1];
		for(int i = 1; i <= bag; i++) {
			dp[i] = i/w[0]*v[0];
		}
		for(int i = 1;i<w.length;i++) {
			for(int j = w[i];j<bag+1;j++) {
				dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
			}
		}
		return dp;
		
	}
	//多重背包问题：类似于0-1背包，和完全背包，需要限制物品的数目K
	//dp[i][j] = Math.max{dp[i-1][j-k*w[j]]+k*v[j],.....},K从1-n[i]
	public static int MutiBag(int[] w,int[] v,int bag) {
		
	}

}
