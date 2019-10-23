package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class 全排序 {
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		dfs(nums,0,nums.length,res);
		return res;
    }
	private static void dfs(int[] nums, int i, int j,List<List<Integer>> res) {
		// TODO Auto-generated method stub
		if(i==j) {
			//输出；
			List<Integer> temp = new ArrayList<Integer>();
			for(int k = 0;k<nums.length;k++) {
				temp.add(nums[k]);
			}
			res.add(temp);
			
		}else {
			for(int k = i;k<j;k++) {
				swap(nums,k,i);
				dfs(nums,i+1,j,res);
				swap(nums,k,i);
			}
			
		}
	}

	private static void swap(int[] temp, int k, int i) {
		// TODO Auto-generated method stub
		int t = temp[k];
		temp[k] = temp[i];
		temp[i] = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
