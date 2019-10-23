import java.util.Arrays;
import java.util.Scanner;

public class tenxun920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] nums1 = new int[n];
		for(int i = 0;i<nums1.length;i++) {
			nums1[i] = in.nextInt();
		}
		int[] nums2 = new int[m];
		for(int i = 0;i<nums2.length;i++) {
			nums2[i] = in.nextInt();
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int a = nums1[nums1.length-2]*nums2[nums2.length-1];
		int b = nums1[1]*nums2[0];
		int c = nums1[1]*nums2[nums2.length-1];
		int d = nums2[0]*nums1[nums1.length-2];
		System.out.println(Math.max(Math.max(Math.max(a, b), c), d));
	}

}
