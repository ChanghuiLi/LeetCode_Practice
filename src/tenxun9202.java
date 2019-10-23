import java.util.Arrays;
import java.util.Scanner;

public class tenxun9202 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] nums1 = new int[n];
			for(int i = 0;i<nums1.length;i++) {
					nums1[i] = in.nextInt();
			}
			int M1 = 0;
			int M2 = 0;
			int H1 = 0;
			int H2 = 0;
			int res = 0;
			for(int i = 0;i<nums1.length;i++) {
				for(int j = i+1;j<nums1.length;j++) {
					int tempx = Math.abs(nums1[i]);
					int tempy = Math.abs(nums1[j]);
					if(tempx>tempy) {
						M1 = tempy;
						M2 = tempx;
					}else {
						M2 = tempy;
						M1 = tempx;
					}
					int tempxaddy = Math.abs(nums1[i]+nums1[j]);
					int tempxminy = Math.abs(nums1[i]-nums1[j]);
					if(tempxaddy>tempxminy) {
						H1 = tempxminy;
						H2 = tempxaddy;
					}else {
						H2 = tempxminy;
						H1 = tempxaddy;
					}
					if(H1<=M1&&H2>M2||H1<M1&&H2>=M2) {
						res++;
					}
				}
			}
			System.out.println(res);
			
				
		}
}

