package Important;

import java.util.Stack;

public class 快排递归和非递归 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 1, 8,1, 5,9};
		Quicksort2(arr, 0, arr.length-1);
		for(int i =0;i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	private static void Quicksort(int[] arr,int start,int end) {
		// TODO Auto-generated method stub
		if(start < end) {
			int mid = patition(arr,start,end);
			Quicksort(arr, start, mid-1);
			Quicksort(arr, mid+1, end);
		}
		
	}
	private static void Quicksort2(int[] arr,int start,int end) {
		if(start>end) return;
		Stack<Integer> s = new Stack<Integer>();
		s.add(start);
		s.add(end);
		int left, right, mid;
		while(! s.isEmpty()) {
			right = s.pop();
			left = s.pop();
			mid = patition(arr,right,left);
			if(left<right) {
			if(mid-1>left) {
				s.push(left);
				s.push(mid-1);
			}
			if(right>mid+1){
				s.push(mid+1);
				s.push(right);
			}
			}
		}
	}
	private static int patition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int res = arr[start];
		int startemp = start;
		int endtemp = end;
		
		while(startemp<endtemp) {
			//后半部分搜索
			while(arr[endtemp]>=res&&startemp<endtemp) {
				endtemp--;
			}
			//前半部分搜索。
			while(arr[startemp]<=res&&startemp<endtemp) {
				startemp++;
			}
			//交换。
			if(startemp<endtemp) {
				swap(arr,startemp,endtemp);
			}
		}
		swap(arr,start,endtemp);
		return endtemp;
	}

	private static void swap(int[] arr, int semp, int emp) {
		// TODO Auto-generated method stub
		int temp = arr[semp];
		arr[semp] = arr[emp];
		arr[emp] = temp;
	}
}