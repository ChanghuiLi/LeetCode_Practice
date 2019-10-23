import java.util.Scanner;

public class 网易01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] nums = new int[n];
//		for(int i = 0;i<nums.length;i++) {
//			nums[i] = in.nextInt();
//		}
//		int res = 0;
//		for(int i = 0;i<nums.length;i++) {
//			for(int j = i+1;j<nums.length;j++) {
//				if(nums[i]>nums[j]) {
//					res = res + Math.abs(i-j);
//				}
//			}
//		}
//		System.out.println(res);
//
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n>=1) {
			int a = in.nextInt();
			int k = in.nextInt();
			int[] nums = new int[a];
			int sum = 0;
			for(int i = 0;i<nums.length;i++) {
				nums[i] = in.nextInt();
				sum = sum+nums[i];
			}
			int i = 0;
			int temp = k;
			for(;i<nums.length;i++) {
				temp = temp+nums[i];
//				System.out.println(temp);
//				System.out.println(nums[i]);
//				System.out.println(temp<(i)*(i+1)/2);
				if(temp<(i)*(i+1)/2) {
					System.out.println("NO");
					break;
				}
			}
			if(i==nums.length)
				System.out.println("YES");
			n--;
			
		}

	}
	public static void main3(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n>=1) {
			int a = in.nextInt();
			int k = in.nextInt();
			int[] nums = new int[a];
			for(int i = 0;i<nums.length;i++) {
				nums[i] = in.nextInt();
			}
			String res = helper(nums,k);
			System.out.println(res);
		}

	}
	private static String helper(int[] nums, int k) {
		// TODO Auto-generated method stub
		int[] dp = new int[nums.length];
		dp[0] = 1;
		//DP[i] = Dp[i-m] {1...K};
		for(int i = 1;i<k;i++) {
			
		}
		return "YES";
	}
}
