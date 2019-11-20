package LeetCode;

public class 和为K的子数组个数 {
	public int subarraySum(int[] nums, int k) {
        if(nums==null && nums.length==0) return -1;
        int res = 0;
        int[] sum = new int[nums.length+1];
        sum[0] = 0;
        for(int i = 1;i < nums.length+1; i++) {
        	sum[i] = nums[i-1] + sum[i-1];
        }
        for(int start = 0; start<nums.length-1;start++) {
        	for(int end = start+1;end < nums.length;end++) {
        		if(sum[end] - sum[start] == k) {
        			res++;
        		}
        	}
        }
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
