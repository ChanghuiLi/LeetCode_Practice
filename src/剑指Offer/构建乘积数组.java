package 剑指Offer;

public class 构建乘积数组 {
	public static void input(int[] num) {
		
		int[] A= new int[num.length];
		int[] B = new int[num.length];
		A[0] = 1;
		for(int i = 1;i<num.length;i++) {
			A[i] = A[i-1]*num[i-1];
		}
		B[num.length-1] = 1;
		for(int i = num.length-1;i>=1;i--) {
			B[i-1] = B[i]*num[i];
		}
		
		for(int i = 0;i<num.length;i++) {
			System.out.println(A[i]+"  "+B[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = {2,3,4,5,6};
		input(res);
	}

}
