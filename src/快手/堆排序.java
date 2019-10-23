package 快手;

public class 堆排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,4,3,2,1};
		Sort(nums);
		for(int i:nums) {
			System.out.println(i);
		}

	}

	private static void Sort(int[] nums) {
		// TODO Auto-generated method stub
		Heapbuild(nums,nums.length-1);
		for(int i = nums.length-1;i>=0;i--) {
			int temp = nums[i];
			nums[i] = nums[0];
			nums[0] = temp;
			Heaplify(nums,0,i-1);
		}
		
	}

	private static void Heaplify(int[] nums, int CurNodeindex, int size) {
		// TODO Auto-generated method stub
		int left = 2*CurNodeindex+1;
		int right = 2*CurNodeindex+2;
		int max = CurNodeindex;
		if(left<=size) {
			if(nums[max]<nums[left]) {
				max = left;
			}
		}
		if(right<=size) {
			if(nums[max]<nums[right]) {
				max = right;
			}
		}
		if(max!=CurNodeindex) {
			int temp = nums[max];
			nums[max] = nums[CurNodeindex];
			nums[CurNodeindex] = temp;
			Heaplify(nums,max,size);
		}
		
		
	}

	private static void Heapbuild(int[] nums, int length) {
		// TODO Auto-generated method stub
		for(int i = length/2;i>=0;i--) {
			Heaplify(nums,i,length);
		}
		
		
	}

}
