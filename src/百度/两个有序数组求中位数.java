package 百度;

public class 两个有序数组求中位数 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] temp = new  int[len];
        int s1 = 0;
        int s2 = 0;
        int i = 0;
        while(s1<nums1.length&&s2<nums2.length) {
        	if(nums1[s1]>nums2[s2]) {
        		temp[i++] = nums2[s2++];
        	}else {
        		temp[i++] = nums1[s1++];
        	}
        }
        while(s1<nums1.length) {
        	temp[i++] = nums1[s1++];
        }
        while(s2<nums2.length) {
        	temp[i++] = nums2[s2++];
        }
        if(temp.length%2==0) {
        	return (double)(temp[temp.length/2]+temp[temp.length/2-1])/2;
        }else {
        	return (temp[temp.length/2+1]);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,9,123};
		int[] b = {2,4,7,8,9,123};
		System.out.println(findMedianSortedArrays(a,b));

	}

}
