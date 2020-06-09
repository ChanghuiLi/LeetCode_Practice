package 数组和矩阵问题;

public class A最大累乘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int help(int[] nums) {
		if(nums==null||nums.length<=0) return 0;
		int max = nums[0];
		int min = nums[0];
		int tempmax = 0;
		int tempmin = 0;
		int res = nums[0];
		for(int i = 1; i < nums.length; i++) {
			tempmax = max * nums[i];
			tempmin = min * nums[i];
			max = Math.max(nums[i], Math.max(tempmax, tempmin));
			min = Math.min(nums[i], Math.min(tempmax, tempmin));
			res = Math.max(res, max);
		}
		return res;
	}

}
