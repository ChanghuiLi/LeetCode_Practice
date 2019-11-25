package 面试前必看;

public class 快排 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void quickSort(int[] nums,int start,int end) {
		if(start<end) {
			int mid = Patition(nums,start,end);
			quickSort(nums,start,mid);
			quickSort(nums,mid+1,end);
		}
		
	}

	private static int Patition(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int tag = nums[start];
		int tempstart = start;
		int tempend = end;
		while(tempstart<tempend) {
			while(nums[tempend]>tag&&tempstart<tempend) {
				tempend--;
			}
			while(nums[tempstart]<=tag&&tempstart<tempend) {
				tempstart++;
			}
			if(tempstart<tempend) {
				swap(nums,tempstart,tempend);
			}
		}
		swap(nums,start,tempend);
		return tempend;
	}

	private static void swap(int[] nums, int tempstart, int tempend) {
		// TODO Auto-generated method stub
		
	}

}
