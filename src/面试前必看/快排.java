package 面试前必看;

public class 快排 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,9,1,2,2,8,9,4,5,3,5,6};
		quickSort(a,0,a.length-1);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}

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
//		int tempstart = start;
//		int tempend = end;
		while(start<end) {
			while(nums[end]>=tag&&start<end) {
				end--;
			}
			while(nums[start]<tag&&start<end) {
				start++;
			}
			if(start<end) {
				swap(nums,start,end);
			}
		}
//		swap(nums,start,tempend);
		return end;
	}

	private static void swap(int[] nums, int tempstart, int tempend) {
		// TODO Auto-generated method stub
		int temp = nums[tempend];
		nums[tempend] = nums[tempstart];
		nums[tempstart] = temp;
	}

}
