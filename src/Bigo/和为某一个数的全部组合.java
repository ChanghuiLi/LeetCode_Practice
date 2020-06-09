package Bigo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 和为某一个数的全部组合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] Twosum(int[] nums,int target) {
		if(nums==null||nums.length<=1) return null;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<nums.length;i++) {
			int temp = target - nums[i];{
				if(map.containsKey(temp)) {
					return new int[] {map.get(temp),i};
				}
				map.put(nums[i], i);
			}
		}
		return null;
	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        Arrays.sort(candidates);
        dfs(candidates,len,target,0,new ArrayDeque<>(),res);
        return res;
    }

	private void dfs(int[] candidates, int len, int residue, int begin, ArrayDeque path, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		//递归终止条件
		if(residue==0) {
			res.add(new ArrayList(path));
			return;
		}
		for(int i = begin; i < len; i++) {
			if(residue-candidates[i]<0) {
				break;
			}
			path.addLast(candidates[i]);
			dfs(candidates,len,residue-candidates[i],i,path,res);
			path.removeLast();
		}
		
	}
	
	//相似元素就不用去找了。
	private void dfs2(int[] candidates, int len, int residue, int begin, ArrayDeque path, List<List<Integer>> res) {
		// TODO Auto-generated method stub
		//递归终止条件
		if(residue==0) {
			res.add(new ArrayList(path));
			return;
		}
		if(residue>0) {
			for(int i = begin; i < len; i++) {
				if(i>begin&&candidates[i] == candidates[i-1]) continue;
				path.addLast(candidates[i]);
				dfs2(candidates,len,residue-candidates[i],i,path,res);
				path.removeLast();
			}
		}
		
		
	}
}
