package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	//遍历两遍的方法；
	public int[] twoSum(int[] nums, int target) {
		
		int[] res = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			}
		}
		int temp = 0;
		for(int i = 0; i<nums.length;i++) {
			temp = nums[i]-target;
			if(map.containsKey(temp)&&map.get(temp)!=i) {
				return new int[] {i,map.get(temp)};
			}
		}
		return res;
        
    }
	//遍历一遍的方法。

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
