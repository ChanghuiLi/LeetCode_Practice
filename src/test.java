import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		AllSort(a);
	}
	public static void AllSort(int[] nums) {
		if(nums.length==0) ;
		if(nums.length==1) System.out.println(nums[0]);
		build(nums,0,nums.length);
		
	}
	private static void build(int[] nums, int i, int length) {
		// TODO Auto-generated method stub
		if(i==length) {
			for(int k = 0;k<length;k++) {
				System.out.print(nums[k]);
			}
			System.out.println();
		}else {
			for(int m = i;m<length;m++) {
				swap(nums,i,m);
				build(nums,i+1,length);
				swap(nums,i,m);
			}
		}
	}
	private static void swap(int[] nums, int start, int i) {
		// TODO Auto-generated method stub
		int temp = nums[start];
		nums[start] = nums[i];
		nums[i] = temp;
	}
}
