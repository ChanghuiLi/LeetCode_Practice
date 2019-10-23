package 百度;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class n的全排序 {
	static List<List<Integer>> resfinal = new ArrayList<List<Integer>>();
	static int count = 0;
	static int input = 0;
	static int output = 0;
	static int[] nums;
	public static void AllSort(int n) {
		int[] temp = new int[n];
		for(int i = 1;i<=temp.length;i++) {
			temp[i-1] = i;
		}
		dfs(temp,0,temp.length);
	}

	private static void dfs(int[] temp, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {
			
			
				boolean isOK = helper(nums,temp);
				if(isOK) {
					output++;
				}
				
			
			//System.out.println();
			
		}else {
			for(int k = i;k<j;k++) {
				swap(temp,k,i);
				dfs(temp,i+1,j);
				swap(temp,k,i);
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
		Scanner in =new Scanner(System.in);
		input = in.nextInt();
		nums=new int[input-1];
		for (int i=0; i<input-1; i++) {
			nums[i] = in.nextInt();
		}
//		
//    	for(int m:nums) {
//    		System.out.println(m);
//    	}
		AllSort(input);
//		int output = 0;
//		for(int i = 0;i<resfinal.size();i++) {
//			boolean isOK = helper(nums,resfinal.get(i));
//			if(isOK) {
//				output++;
//			}
//		}
		//System.out.println(resfinal);
		System.out.println(output);
	}

	private static boolean helper(int[] nums, int[] temp) {
		// TODO Auto-generated method stub
		int i = 0;
		for(;i<nums.length;) {
			if(nums[i]==0) {
				if(temp[i]<temp[i+1]) {
					i++;
				}else {
					return false;
				}
			}else {
				if(temp[i]>temp[i+1]) {
					i++;
				}else {
					return false;
				}
				
			}
		}
		if(i==nums.length) {
			return true;
		}else {
			return false;
		}
		
	}

}
