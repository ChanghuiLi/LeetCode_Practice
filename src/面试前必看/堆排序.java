package 面试前必看;

public class 堆排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void Heapsort(int[] nums) {
		buildheap(nums,nums.length-1);
		for(int i = nums.length-1;i>=0;i--) {
			swap(nums,i,0);
			heaplify(nums,0,i-1);
		}
	}
	
	//当前节点，堆化。找到当前节点向下推，找到左右子树最大的。交换，一直到树的叶子节点。
	private static void heaplify(int[] nums, int i,int j) {
		// TODO Auto-generated method stub
		int left = 2*i+1;
		int right = 2*i+2;
		int max = i;
		if(left<=j) {
			if(nums[max]<nums[left]) {
				max = left;
			}
		}
		if(right<=j) {
			if(nums[max]<nums[right]) {
				max = right;
			}
		}
		if(max!=i) {
			swap(nums,max,i);
			heaplify(nums,max,j);
		}
		
	}


	private static void buildheap(int[] nums, int l) {
		// TODO Auto-generated method stub
		for(int i = nums.length/2;i>=0;i--) {
			heaplify(nums,i,l);
		}
		
	}
	

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
