package 面试前必看;

public class 股票买卖问题 {
	
	public static int One(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int min = nums[0];
		int res = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i]<min) {
				min = nums[i];
			}else if(nums[i]-min>res) {
				res = nums[i]-min;
			}
		}
		return res;
	}
	
	public int Many(int[] nums) {
		if(nums==null||nums.length<=1) return 0;
		int res = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i]>nums[i-1]) {
				res += nums[i]-nums[i-1];
			}
		}
		return res;
	}
	public int Two(int[] nums) {
		if(nums==null||nums.length<=1) return 0;
		int s1 = -nums[0],s2 = Integer.MIN_VALUE,s3 = Integer.MIN_VALUE,s4 = Integer.MIN_VALUE;
		//每天有四种状态，更新这个状态就可以。
		for(int i = 1;i < nums.length; i++) {
			s1 = Math.max(s1, -nums[i]);
			s2 = Math.max(s2, s1+nums[i]);
			s3 = Math.max(s3, s2-nums[i]);
			s4 = Math.max(s4, s3+nums[i]);
		}
		return Math.max(0, s4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
