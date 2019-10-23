package DP;

public class ImportCuting {
	//长度为n的绳子，剪k段，乘积最大。
	public static int maxAfterCutting(int length) {
		if(length<=3) return length;
		//定义状态，长度为k的绳子最大乘积的长度为length[i]
		int[] fn = new int[length+1];
		//f(x) = f(x-i)*当前长度
		fn[0] = 0;
		fn[1] = 1;
		fn[2] = 2;
		fn[3] = 3;
		int res;
		for(int i  = 4;i<=length;i++) {
			res = 0;
			for(int j = 1;j< i ;j++) {
				res = Math.max(j*fn[i-j], res);
			}
			fn[i] = res;
		}
		return fn[length];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(maxAfterCutting(8));
	}

}
