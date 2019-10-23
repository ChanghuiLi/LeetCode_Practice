import java.util.Arrays;
import java.util.Scanner;

public class tenxun9203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[][] nums = new int[n][2];
		int set = 0;
		for(int i = 0;i<n;i++) {
			nums[i][0] = in.nextInt();
			nums[i][1] = in.nextInt();
		}
		Arrays.sort(nums,(i1,i2)->Integer.compare(i1[0],i2[0]));
		int tempsum = 0;
		int p = nums.length-1,j=k;
		for(;j>0;p--,j--) {
			tempsum = tempsum+nums[p][0];
		}
		System.out.println(nums[p+1][1]*tempsum);

	}

}
