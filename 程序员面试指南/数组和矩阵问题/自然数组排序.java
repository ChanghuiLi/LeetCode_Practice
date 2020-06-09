package 数组和矩阵问题;

public class 自然数组排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Solution(int[] nums) {
		if(nums==null||nums.length<=1) return;
		int temp = 0;
		for(int i = 0;i<nums.length;i++) {
			
			while(nums[i]!=i+1) {
				temp = nums[nums[i]-1];
				nums[nums[i]-1] = nums[i];
				nums[i] = temp;
			}
		}
	}

}
