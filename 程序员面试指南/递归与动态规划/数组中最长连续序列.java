package 递归与动态规划;

import java.util.HashMap;

public class 数组中最长连续序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int Solution(int[] nums) {
		// Key是元素值，value包含该元素的最大长度。
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int max = 1;
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
				//左右两边开始检索。
				if(map.containsKey(nums[i]-1)) {
					max = Math.max(max,find(map,nums[i]-1,nums[i]));
				}
				if(map.containsKey(nums[i]-1)) {
					max = Math.max(max,find(map,nums[i],nums[i]+1));
				}
			}
		}
		return max;
	}

	private int find(HashMap<Integer, Integer> map, int i, int j) {
		// TODO Auto-generated method stub
		//不断更新两端
		int left = i-map.get(i)+1;
		int right = i+map.get(j)-1;
		int len = right - left + 1;
		map.put(left, len);
		map.put(right, len);
		return 0;
	}

}
