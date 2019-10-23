import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C36001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int M = in.nextInt();
	    int[] nums = new int[N];
	    for(int i = 0;i<nums.length;i++) {
	    	nums[i] = in.nextInt();
	    }
	    double res = 0;
	    int out = 0;
	    for(int i = M;i<=nums.length;i++) {
	    	out = max(nums,M);
	    	res = Math.max(res, (double)out/i);
	    }
	    DecimalFormat df = new DecimalFormat("0.000");
	    System.out.println(df.format(res));
	    

	}
	public static List<Double> max(int[] nums,int w) {
		int start = 0;
		int end = w;
		int re = 0;
		for(int i = 0;i<end;i++) {
			re = re +nums[i];
		}
		int temp = re;
		List<Double> res = new ArrayList<Double>();
		for(int i = start;i<nums.length-w;i++) {
			end = start+w;
			temp = temp+nums[end]-nums[start];
			while(end<nums.length) {
				temp = temp+nums[end];
				end++;
				res[p++] = temp;
				out = Math.max(out, temp);
			}
		}
		
		
		return out;
	}

}
