package 百度Feed流;

public class 打家劫舍 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int rober(int[] nums) {
		if(nums == null) return 0;
		if(nums.length == 1) return nums[0];
		if(nums.length == 2) return Math.max(nums[0], nums[1]);
		int premax = nums[0];
		int cur = nums[1];
		for(int i = 0; i < nums.length; i++) {
			int temp = cur;
			cur = Math.max(cur, premax+nums[i]);
			premax = temp;
		}
		return cur;
	}

}
