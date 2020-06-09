package 数组和矩阵问题;

public class A需要排序最短子数组长度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,3,4,2,6,7};
		System.out.println(Solution(a));

	}
	//左右两边开始搜索，找到比最小的还大，比最大的还小。
	public static int Solution(int[] nums) {
		if(nums==null||nums.length<=1) return nums.length;
		int min = nums[nums.length-1];
		int left = -1;
		int max = nums[0];
		int right = -1;
		for(int i = nums.length-2;i>=0;i--) {
			if(nums[i]>min) {
				left = i;
			}else {
				min = Math.min(min, nums[i]);
			}
		}
		if(left==-1) {
			return 0;
		}
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]<max) {
				right = i;
			}else {
				max = Math.max(max, nums[i]);
			}
		}
		if(right==-1) {
			return 0;
		}
		return right-left+1;
	}

}
