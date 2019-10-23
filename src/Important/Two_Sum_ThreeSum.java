package Important;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Two_Sum_ThreeSum {
	public List<List<Integer>> threeSum(int[] nums){
		if(nums.length<3||nums == null) return null;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0;i<nums.length;i++) {
			int temp = nums[i];
			int low = i+1;
			int high = nums.length-1;
			while(low<high) {
				int twosum = nums[low]+nums[high];
				if(twosum==-temp) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(temp);
					list.add(nums[low]);
					list.add(nums[high]);
					if(!res.contains(list)) {
						res.add(list);
					}
					
				}
				if(twosum>-temp) {
					high--;
				}else {
					low++;
				}
			}
		}
		return res;
	}
	public int[] twoSum(int[] nums, int target) {
		//用一个hashmap，当前值与target的差值，在map中检索。
		int[] res = new int[] {-1,-1};
		if(nums.length<=1) return res;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[]{map.get(target - nums[i]),i};
			}
			else {
				map.put(nums[i], i);
			}
		}
		return res;
	}
}
