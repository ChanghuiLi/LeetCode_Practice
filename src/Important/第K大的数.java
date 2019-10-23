package Important;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 第K大的数 {
	public static int topK(int[] nums,int k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(k > nums.length || k == 0){
	           return 0;
	       }
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(nums.length-1);
		for(int i = 0;i<nums.length;i++) {
			maxheap.add(nums[i]);
		}
		for(int j = k;j>0;j--) {
			res.add(maxheap.remove());
		}
		return res.get(k-1);
	}
	public static int topK2(int[] nums,int k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(k > nums.length || k == 0){
	           return 0;
	    }
		int start = 0;
		int end = nums.length-1;
		int mid = partition(nums,start,end);
		System.out.println(mid);
		while(mid!=k-1) {
			if(mid>k-1) {
				mid = partition(nums,start,mid-1);
			}else {
				mid = partition(nums,mid+1,end);
			}
		}
		
		return nums[mid];
	}
	public static int minK(int[] nums,int k) {
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return o2 -o1;
			}
		});
		for(int i = 0;i<nums.length;i++) {
			minheap.add(nums[i]);
		}
		return minheap.peek();
	}
	
	private static int partition(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int tag = nums[start];
		int i = start;
		int j = end;
		while(i<j) {
			while(nums[j]>=tag&&i<j) {
				j--;
			}
			while(nums[i]<=tag&&i<j) {
				i++;
			}
			if(i<j) {
				swap(nums,i,j);
				
			}
		}
		swap(nums,start,j);
		return j;
	}
	private static void swap(int[] arr, int semp, int emp) {
		// TODO Auto-generated method stub
		int temp = arr[semp];
		arr[semp] = arr[emp];
		arr[emp] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  t = {3,7,1,2,3,4,5,6,3};
		/*ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0;i<t.length;i++) {
			temp.add(t[i]);
		}*/
		int k = topK2(t,7);
		int m = minK(t,5);
		System.out.println(k);
		System.out.println(m);
	}
	
}
