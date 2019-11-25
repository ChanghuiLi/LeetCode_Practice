package 面试前必看;

import java.util.PriorityQueue;

public class 最大K个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] topK(int[] nums, int k) {
		PriorityQueue<Integer> res = new PriorityQueue<Integer>(nums.length-1);
		for(int i =0;i<nums.length;i++) {
			res.add(nums[i]);
		}
	}

}
