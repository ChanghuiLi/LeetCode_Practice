package 百度Feed流;

public class 快排 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,9,1,2,45,3,5,6};
		QuickSort(a,0,7);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void QuickSort(int[] nums,int start,int end) {
		while(start<end) {
			int p = patition(nums,start,end);
			QuickSort(nums,start,p);
			QuickSort(nums,p+1,end);
		}
	}
	private static int patition(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int p = nums[start];
		while(start<end) {
			while(nums[end]>=p&&end>start) {
				end--;
			}
			while(nums[start]<p&&end>start) {
				start++;
			}
			if(end>start) {
				swap(nums,start,end);
			}
		}
//		swap(nums,start,end);
		return end;
	}
	private static void swap(int[] nums, int tempstart, int tempend) {
		// TODO Auto-generated method stub
		int temp = nums[tempend];
		nums[tempend] = nums[tempstart];
		nums[tempstart] = temp;
	}

}
