package 数组和矩阵问题;

public class 打印排序数组加和为元素K的组合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void Solution(int[] nums,int k) {
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			if(nums[left]+nums[right] == k) {
				if(left==0||nums[left-1]==nums[left]) {
					System.out.println(left+"  "+ right);
					left++;
					right--;
				}
			}else if(nums[left]+nums[right] > k) {
				right--;
			}else {
				left++;
			}
		}
	}

}
