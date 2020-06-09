package 百度Feed流;

public class 有序数组求中位数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,9,123};
		int[] b = {1};
		System.out.println(Solution(a,b));

	}
	public static double Solution(int[] nums,int[] nums2) {
		int res = 0;
		int tag1 = 0;
		int tag2 = 0;
		int mid = nums.length/2;
		while(tag1<nums.length&&tag2<nums2.length&&mid>0) {
			while(nums.length>tag1&&nums[tag1]>=nums2[tag2]&&mid>0) {
				tag1++;
				res = 1;
				mid--;
			}
			while(nums2.length>tag2&&nums[tag1]<=nums2[tag2]&&mid>0) {
				tag2++;
				res = 2;
				mid--;
			}
		}
		while(tag1==nums.length&&mid>0) {
			tag2++;
			mid--;
			res = 2;
		}
		while(tag2==nums.length&&mid>0) {
			tag1++;
			mid--;
			res = 1;
		}
		
		if(mid%2==1) {
			if(res==1) {
				return nums[tag1];
			}else {
				return nums2[tag2];
			}
		}else {
			double out = 0;
			if(res==1) {
				if(tag2>0) {
					out = (nums[tag1]+Math.max(nums[tag1-1],nums2[tag2-1]))/2.0;
				}else {
					out = (nums[tag1]+nums[tag1-1])/2.0;
				}
				return out;
			}else {
				if(tag1>0) {
					out = (nums2[tag2]+Math.max(nums[tag1-1],nums2[tag2-1]))/2.0;
				}else {
					out = (nums2[tag2]+nums2[tag2-1])/2.0;
				}
				return out;
			}
		}
	}

}
