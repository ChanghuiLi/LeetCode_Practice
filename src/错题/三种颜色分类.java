package 错题;

public class 三种颜色分类 {
	public void sortColors(int[] nums) {
        if(nums==null||nums.length==0) return;
        int start = 0;
        int curr = 0;
        int end = nums.length-1;
        while(curr<end) {
        	if(nums[curr]==0) {
        		swap(nums,curr,start);
        		start++;
        	}
        	if(nums[curr]==2) {
        		swap(nums,curr,end);
        		end--;
        	}
        	curr++;
        }
    }

	private void swap(int[] nums, int curr, int start) {
		// TODO Auto-generated method stub
		int temp = nums[curr];
		nums[curr] = nums[start];
		nums[start] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
