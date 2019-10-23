import java.util.Scanner;

public class didi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		
		for(int i = 0;i<n;i++) {
			a[i] = in.nextInt();
			
		}
		int tempres = 0;
		if(m>=n) {
			for(int i = 0;i<n;i++) {
				tempres+=a[i];
			}
			System.out.println(tempres);
		}else {
			tempres = Integer.MAX_VALUE;
			int[][] out = new int[n+1][n+1];
			for(int i = 1;i<=n;i++) {
				for(int j =i;j<=n;j++) {
					out[i][j] = out[i][j-1]+a[j-i];
					if(j-i+1>=m&&out[i][j]<tempres) {
						tempres = out[i][j];
					}
				}
			}
		}
		System.out.println(tempres);
//		sum[0] = 0;
//		int cur = 0;
//		int z = 0;
//		int res = 0;
//		for(int i = 0;i<n;i++) 
//			sum[i+1] = a[i]+sum[i];
//		cur= m;
//		z = 0;
//		while(cur<=n) {
//				res = Math.min(sum[cur]-z, res);
//				cur++;
//				z = Math.max(z, sum[cur-m]);
//		}
//		System.out.println(res);
		

	}

}
