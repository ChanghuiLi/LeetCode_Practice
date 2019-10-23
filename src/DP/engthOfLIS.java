package DP;

public class engthOfLIS {
	public int lengthOfLIS(int[] nums) {
		if(nums.length <=0||nums == null) return 0;
		int[] len = new int[nums.length];
		len[0] = 1;
		int res = 1;
		for(int i = 1;i<nums.length;i++) {
			len[i] = 1;
			for(int j = i-1;j>=0;j--) {
				if(nums[i]>nums[j]) {
					len[i] = Math.max(len[i], len[j]+1);
					//len[i] = len[j]+1;//这样是不行的必须全部遍历完前面的序列。
				}
			}
			res = Math.max(len[i], res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
