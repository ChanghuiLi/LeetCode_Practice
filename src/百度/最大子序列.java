package 百度;

import java.util.ArrayList;

public class 最大子序列 {
	public static ArrayList<Integer> maxSubArray2(int[] nums) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(nums.length==0||nums==null) return temp;
		if(nums.length==1) {
			temp.add(nums[0]);
			return temp;
		}
		int[] res = new int[nums.length];
		res[0] = nums[0];
		for(int i = 1;i<nums.length;i++) {
			res[i] = Math.max(nums[i], res[i-1]+nums[i]);
		}
		int maxindex = 0;
		int max = res[0];
		for(int j=1;j<res.length;j++) {
			if(res[j]>max) {
				max = res[j];
				maxindex = j;
			}
		}
		for(int k = maxindex;max!=0;k--) {
			temp.add(nums[k]);
			max-=nums[k];
		}
		return temp;
		
	}
	public static int maxSubArray(int[] nums) {
        if(nums.length==0||nums==null) return -1;
        if(nums.length==1) return nums[0];
        int[] res = new int[nums.length];
        res[0]=nums[0];
        //包含当前元素的最大子序列
        for(int i = 1;i<nums.length;i++) {
        	res[i] = Math.max(res[i-1]+nums[i], nums[i]);
        }
        int max = res[0];
		for(int j=1;j<res.length;j++) {
			if(res[j]>max) {
				max = res[j];
			}
		}
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,-5,3,7,-23,5};
		ArrayList<Integer> res = maxSubArray2(num);
		int res2 = maxSubArray(num);
		System.out.println(res2);
		System.out.println(res);
	}

}
