package 百度;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 全排序2 {
	//广度优先遍历
	public static void AllSort(int[] nums) {
		if(nums.length<=1||nums==null) {
			return;
		}
		int start = 0;
		int end = nums.length-1;
		allsort(nums,start,end);
	}

	private static void allsort(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end) {
			System.out.println(nums);
		}else {
			for(int i = start+1;i<=end;i++) {
				swap(nums,start,i);
				allsort(nums,start,end);
				swap(nums,start,i);
			}
		}
	}

	private static void swap(int[] nums, int start, int i) {
		// TODO Auto-generated method stub
		int temp = nums[start];
		nums[start] = nums[i];
		nums[i] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String b = in.nextLine();
		char[] a = b.toCharArray();
		String tag1 = "";
		for(int i = 0;i<10;i++) {
			tag1 = tag1+Integer.toString(i);
		}
		char[] tag = tag1.toCharArray(); 
		helper(a,0,a.length,tag);
		if(a[0]=='?'&&a.length>1) {
			for(int i = 1;i<Math.pow(10, a.length-1);i++) {
				if(i%13==5) {
					res.add(String.valueOf(i));
				}
			}
		}
		for(String k:res) {
			System.out.println(k);
		}
		
		System.out.println(res.size());
//		
//		int[] t = {1,2,3,4};
//		AllSort(t);
	}
	
	static List<String> res = new ArrayList<String>();
	public static void helper(char[] a, int i, int j, char[] tag) {
		// TODO Auto-generated method stub
		if(i==j) {
			String a1 = String.valueOf(a);
//			res.add(a1);
//			return;
			if(Integer.parseInt(a1)%13==5) {
				res.add(a1);
			}
		}else {
			if(i==0&&a[i]=='?') {
				for(int m = 1;m<tag.length;m++) {
					a[i] = tag[m];
					helper(a,i+1,j,tag);
					a[i] = '?';
				}
			}else if(a[i]>='0'&&a[i]<='9') {
				helper(a,i+1,j,tag);
			}else {
				for(int m = 0;m<tag.length;m++) {
					a[i] = tag[m];
					helper(a,i+1,j,tag);
					a[i] = '?';
				}
			}
		}
		
	}


}
