package 百度;

import java.util.ArrayList;

public class 两个有序数组去重 {
	public static ArrayList<Integer> move(int[] nums1,int[] nums2) {
		int s1 = 0;
		int s2 = 0;
		ArrayList<Integer> res = new ArrayList<Integer>();
		while(s1<nums1.length&&s2<nums2.length) {
			if(nums1[s1]==nums2[s2]) {
				res.add(nums1[s1]);
				s1++;
				s2++;
			}else if(nums1[s1]>nums2[s2]) {
				s2++;
			}else {
				s1++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,123};
		int[] b = {2,4,6,7,8,123};
		ArrayList<Integer> res = move(a,b);
		for(int i = 0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
	}

}
