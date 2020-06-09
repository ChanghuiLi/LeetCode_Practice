package 数组和矩阵问题;

public class A容器盛水问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3,1,2,5,2,4};
		int[] b = new int[] {4,5,1,3,2};
		System.out.println(Solution(a));

	}
	public static int bestSolution(int[] nums) {
		int res = 0;
		int leftmax = nums[0];
		int rightmax = nums[nums.length-1];
		int L = 1;
		int R = nums.length-2;
		while(L<R) {
			if(leftmax<rightmax) {
				res += Math.max(0, leftmax-nums[L]);
				leftmax = Math.max(leftmax, nums[L++]);
			}else {
				res += Math.max(0, rightmax-nums[R]);
				rightmax = Math.max(rightmax, nums[R--]);
			}
		}
		return res;
	}
	
	
	public static int Solution(int[] nums) {
		int[] leftmax = help(nums);
		int[] rightmax = help2(nums);
		int res = 0;
		for(int i = 1;i<nums.length;i++) {
			if(leftmax[i]>nums[i]&&rightmax[i]>nums[i]) {
				res += (Math.min(leftmax[i], rightmax[i])-nums[i]);
			}
		}
		return res;
	}
	private static int[] help2(int[] nums) {
		// TODO Auto-generated method stub
		int[] res = new int[nums.length];
		res[0] = 0;
		int max = nums[0];
		for(int i = 1; i<nums.length; i++) {
			res[i] = Math.max(max, nums[i-1]);
		}
		return res;
	}
	private static int[] help(int[] nums) {
		// TODO Auto-generated method stub
		int[] res = new int[nums.length];
		res[nums.length-1] = 0;
		int max = nums[nums.length-1];
		for(int i = nums.length-2; i>=0; i--) {
			res[i] = Math.max(max, nums[i+1]);
		}
		return res;
	}
	
	

}
