import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

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
	    if(nums.length>5000){
	    	int out2 = max2(nums,M);
		    DecimalFormat df = new DecimalFormat("0.000");
		    System.out.println(df.format((double)out/M));
        }else {
        	 for(int i = M;i<=nums.length;i++) {
                 
                 out = max(nums,M);
 	    		res = Math.max(res, (double)out/i);
             
 	    	
 	    }
 	    DecimalFormat df = new DecimalFormat("0.000");
 	    System.out.println(df.format(res));
        }
	   
	    

	}
	public static int max2(int[] nums,int w) {
		int start = 0;
		int end = w;
		int re = 0;
		for(int i = 0;i<end;i++) {
			re = re +nums[i];
		}
		int[] res = new int[nums.length-w+1];
		res[0] = re;
		int p = 1;
		int temp = re;
		int out = temp;
		while(end<nums.length) {
			temp = temp+nums[end]-nums[start];
			end++;
			start++;
			res[p++] = temp;
			out = Math.max(out, temp);
		}
		
		return out;
	}
	public static int max(int[] nums,int w) {
		int start = 0;
		int end = w;
		int re = 0;
		for(int i = 0;i<end;i++) {
			re = re +nums[i];
		}
		int[] res = new int[nums.length-w+1];
		res[0] = re;
		int p = 1;
		int temp = re;
		int out = temp;
		while(end<nums.length) {
			temp = temp+nums[end]-nums[start];
			end++;
			start++;
			res[p++] = temp;
			out = Math.max(out, temp);
		}
		
		return out;
	}

}
