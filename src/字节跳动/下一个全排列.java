package 字节跳动;

public class 下一个全排列 {
	//顺序排列
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public void nextPermutation(int[] nums) {
		//从后往前搜索，找到逆序的元素，第二遍搜索找到最逆序比它大的元素进行交换。
		int tag2 = nums.length-2;
		while(tag2>=0&&nums[tag2]>=nums[tag2+1]) {
			tag2--;
		}
		if(tag2>=0) {
			int j = nums.length-1;
			while(j>=0&&nums[j]<=nums[tag2]) {
				j--;
			}
			swap(nums,tag2,j);
		}
		reverse(nums,tag2+1);
        
    }

	private void swap(int[] nums, int tag2, int j) {
		// TODO Auto-generated method stub
		
	}

	private void reverse(int[] nums, int i) {
		// TODO Auto-generated method stub
		
	}

}
