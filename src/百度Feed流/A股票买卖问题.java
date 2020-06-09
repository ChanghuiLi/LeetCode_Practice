package 百度Feed流;

public class A股票买卖问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int StockOne(int[] nums) {
		int res = 0;
		int min = nums[0];
		for(int i = 1;i<nums.length;i++) {
			if(nums[i]>min) {
				res = Math.max(res, nums[i]-min);
			}else {
				min = nums[i];
			}
		}
		return res;
	}
	
	public static int TwoStock(int[] nums) {
		
	}

}
