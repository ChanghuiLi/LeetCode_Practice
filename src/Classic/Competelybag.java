package Classic;

public class Competelybag {
	public static void main(String[] args){
        int[] a = {2,3,4,5,7,7};
        int[] b = {3,4,5,6,11,100};
        int bag = 7;
        int[][] temp = Bag01(a,b,bag);
        for(int i = 0;i<temp.length;i++) {
        	for(int j = 0;j<temp[0].length;j++) {
        		System.out.print(temp[i][j]);
        	}
        	System.out.println(" ");
        }
        int[] set = Bag01compete(a,b,bag);
        
    }
//https://blog.csdn.net/na_beginning/article/details/62884939
	private static int[][] Bag01(int[] w, int[] v,int b) {
		int[][] dp = new int[w.length+1][b+1];
		for(int j = 1;j<=b;j++) {
			dp[1][j] = (j/w[0])*v[0];
		}
		//遍历物品数组
		for(int i = 2;i<=v.length;i++) {
			//遍历容量
			for(int j = 1;j<=b;j++) {
				if(j<w[i-1]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.max(dp[i][j-w[i-1]]+v[i-1], dp[i-1][j]);
				}
				
			}
		}
		return dp;
	}
	private static int[] Bag01compete(int[] w, int[] v,int b) {
		int[] dp = new int[b+1];
		for(int j = 1;j<=b;j++) {
			dp[j] = (j/w[0])*v[0];
		}
		for(int i = 2;i<=v.length;i++) {
			//遍历容量
			for(int j = w[i-1];j<=b;j++) {
				if(dp[j]>=w[i-1]) {
					dp[j] = Math.max(dp[j], dp[j-w[i-1]]+v[i-1]);
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
