package 数组和矩阵问题;

public class 数组中找到次数大于NK个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,2,3,1,};
		Solution(a);

	}
	public static void Solution(int[] nums) {
		int cand = nums[0];
		int count = 1;
		for(int i = 1;i<nums.length;i++) {
			if(count == 0) {
				cand = nums[i];
				count = 1;
			}else if(nums[i]==cand){
				count++;
	
			}else {
				count--;
			}
		}
		count = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]==cand) {
				count++;
			}
		}
		if(count>nums.length/2) {
			System.out.println(cand);
		}else {
			System.out.println("don't have");
		}
		
	}

}
