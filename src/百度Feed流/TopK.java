package 百度Feed流;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TopK{
	public static ArrayList<Integer> TopK(int[] nums) {
		ArrayList<Integer> max = new ArrayList<Integer>();
		PriorityQueue<Integer> heap =  new PriorityQueue<Integer>(10,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(01);
			}
			
		});
		return max;
		
	}
	
	public static int Quickfind(int[] nums,int k) {
		int start = 0;
		int end = nums.length-1;
		int m = 0;
		while(m!=k+1) {
			m = patition(nums,start,end);
			if(m<k+1) {
				m = patition(nums,start,m-1);
			}else if(m>k+1){
				m = patition(nums,m+1,end);
			}
			
		}
		return nums[m];
		
	}

	private static int patition(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		return 0;
	}

}
