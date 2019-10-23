package 百度;

import java.util.LinkedList;

public class 有序数组中位数交集 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0&&nums2.length==0) return -1;
        int len = nums1.length+nums2.length;
        int mid = 0;
        int s1 = 0;
        int s2 = 0;
        int res=0;
        if(len%2 == 1) {
        	mid = (len+1)/2;
        	int temp = 0;
        	while(s1<nums1.length);
        	}
        return 0;
        }
	public LinkedList<Integer> intersection(int[] A, int[] B){
		LinkedList<Integer> res = new  LinkedList<Integer>();
		int pA = 0;
		int pB = 0;
		while(pA < A.length && pB < B.length) {
			if(A[pA]>B[pB]) pB++;
			else if(A[pA]<B[pB]) pA++;
			else{
				res.add(A[pA]);
				pA++;
				pB++;
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,6,9,12,14,17};
		int[] nums2 = {1,2,3,7,18,25};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}

}
