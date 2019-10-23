package 百度;

public class 旋转数组查找 {
	public int search(int[] nums, int target) {
        if(nums.length==0||nums==null) return -1;
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start<end) {
        	mid = (start+end)/2;
        	if(nums[mid]>target&&targetnums[start])
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
