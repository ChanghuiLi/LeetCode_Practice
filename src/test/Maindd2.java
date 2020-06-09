package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Maindd2 {
	public class Sortcom implements Comparator<Integer>{
		public int compare(Integer o1,Integer o2) {
			if(o1<o2) {
				return 1;
			}else if(o1==o2) {
				return 0;
			}else {
				return -1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i< n;i++) {
			int temp = in.nextInt();
			boolean[] visited = new boolean[temp];
			System.out.println(temp);
			int[] nums = new int[temp];
			int max = 0;
			int sum = 0;
			for(int j = 0;j<nums.length;j++) {
				nums[j] = in.nextInt();
				max =Math.max(max, nums[i]);
				sum = sum+nums[i];
			}
			System.out.println("sum "+sum+" max" + max);
			Arrays.sort(nums);
			if(sum%4!=0||max>sum/4||nums.length<4) {
				System.out.println("NO");
				continue;
				
			}else {
				if(dfs(visited,nums,0,0,0,sum/4)) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
		
	}
	
	private static boolean dfs(boolean[] a, int[] nums, int n, int len, int s,int side) {
		// TODO Auto-generated method stub
		if(n==4) return true;
		for(int i = s;i<n;i++) {
			if(a[i]) 
				continue;
			else {
			a[i] = true;
			if(len+nums[i]<side){
				if(dfs(a,nums,n,len+nums[i],i,side)) return true;
			}else if(len+nums[i]==side){
				if(dfs(a,nums,n+1,0,0,side)) return true;
			}
			a[i] = false;
			}
		
		}
		return false;
	}

}
