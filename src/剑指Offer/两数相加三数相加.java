package 剑指Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 两数相加三数相加 {
	//两数之和
	public int[] twoSum(int[] nums, int target) {
		int[] res = {-1,-1};
        if(nums==null||nums.length<=1) return res;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < nums.length; i++) {
        	if(map.containsKey((target-nums[i]))) {
        		return new int[] {map.get(target-nums[i]),i};
        	}else {
        		map.put(nums[i], i);
        	}
        }
        return res;
    }
	
	//三数之和
	public List<List<Integer>> threeSum1(int[] nums) {
		//先排序
		Arrays.sort(nums);
		List<List<Integer>> r=new ArrayList<>();
		HashMap<Integer,Integer> index=new HashMap<>();
		for(int i=0;i<nums.length;i++)
			index.put(nums[i], i);
		for(int i=0;i<nums.length-2;i++){
			if (i == 0 || nums[i - 1] != nums[i]) {
				for(int j=i+1;j<nums.length-1;j++){
					//处理重复值
					if (j == i + 1 || nums[j - 1] != nums[j]) {
						int target=-(nums[i]+nums[j]);
						if(index.containsKey(target) && index.get(target)>j){
							r.add(Arrays.asList(nums[i], nums[j], target));
						}
					}
				}
			}
			
		}
		return r;
    }
	//先排序，一大一小指针。
	public List<List<Integer>> threeSum(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> r=new ArrayList<>();
		
		return r;
	}
	
	public static int minsum(int[] nums) {
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length-1;
		int res = Math.abs(nums[start]+nums[end]);
		int temp = 0;
		while(start<end) {
			temp = Math.abs(nums[start]+nums[end]);
			res = Math.min(temp, res);
			if(Math.abs(nums[start])>Math.abs(nums[end])) {
				start++;
			}else {
				end--;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {-100,5,1,2,6,-4,3,1};
		System.out.println(minsum(a));

	}

}
