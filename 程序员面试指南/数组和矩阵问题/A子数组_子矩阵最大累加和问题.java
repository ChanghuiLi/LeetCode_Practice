package 数组和矩阵问题;

public class A子数组_子矩阵最大累加和问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] {{-1,-2,-3},{-1,2,3},{1,1,1}};
		int[] b = new int[] {1,2,-3,4,5,-1};
		System.out.println(a[1][2]);
		System.out.println(SolutionArray(b));
		System.out.println(Solutionmatrix(a));

	}
	
	public static int SolutionArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for(int i = 0; i < nums.length; i++) {
			cur += nums[i];
			max = Math.max(max, cur);
			cur = cur < 0?0:cur;
		}
		return max;
	}
	
	public static int Solutionmatrix(int[][] matrix) {
		int[] temp = null;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<matrix.length;i++) {
			temp = new int[matrix[0].length];
			for(int j = i;j<matrix.length;j++) {
				for(int k = 0;k<temp.length;k++) {
					temp[k] = temp[k]+matrix[j][k];
					System.out.print(temp[k]+" ");
				}
				max = Math.max(max, SolutionArray(temp));
				System.out.println("max " +i +" " +max);
			}
		}
		return max;
	}

}
