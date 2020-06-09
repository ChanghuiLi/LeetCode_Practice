package test;

import java.util.Arrays;
import java.util.Scanner;

public class Maindd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<nums.length;i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		int res = 0;
		for(int i = 1;i<nums.length;i++) {
			if(nums[i]<=nums[i-1]) {
				res = res + (nums[i-1]-nums[i]+1);
				nums[i] = nums[i-1]+1;
				
			}
		}
//		for(int i = 0;i<nums.length;i++) {
//			System.out.print(nums[i]+" ");
//		}
		System.out.println(res);
		
	}

}
