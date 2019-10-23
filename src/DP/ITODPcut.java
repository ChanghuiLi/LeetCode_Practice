package DP;

public class ITODPcut {
	//切钢条。

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] r = new int[10];
		int[] v = {1,5,8,9,10,17,17,20,24,30};
		int len = 10;
		int[] res = dp(v,len);
		for(int i =0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		
	}

	private static int[] dp(int[] v,int len) {
		// TODO Auto-generated method stub
		int[] temp = new int[len+1];
		temp[1] = v[0];
		for(int i = 2;i<temp.length;i++) {
			int q = 0;
			for(int j=0;j<i;j++) {
				q = Math.max(q, v[j]+temp[i-j-1]);
			}
			temp[i] = q;
		}
		return temp;
	}

}
