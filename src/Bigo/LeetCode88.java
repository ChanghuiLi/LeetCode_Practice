package Bigo;

import java.util.Arrays;

public class LeetCode88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		merge(nums1,3,nums2,3);

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m-1;
		int p2 = n-1;
		int p = m+n-1;
		while(p1>=0 && p2>=0) {
			nums1[p--] = (nums1[p1]>nums2[p2]? nums1[p1--]:nums2[p2--]);
		}
		while(p1>=0) {
			nums1[p--] = nums1[p1--];
		}
		while(p2>=0) {
			nums1[p--] = nums2[p2--];
		}
		
		System.out.println(Arrays.toString(nums1));
    }
	
	

}
