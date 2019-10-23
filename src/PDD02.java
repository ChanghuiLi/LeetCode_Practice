import java.util.Arrays;
import java.util.Scanner;

public class PDD02 {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       int M = in.nextInt();
       int[][] res = new int[M][2];
       int i = 0;
       while(i<M) {
    	   res[i][0] = in.nextInt();
    	   res[i][1] = in.nextInt();
    	   i++;
       }
       Arrays.sort(res,(i1,i2)->Integer.compare(i1[0],i2[0]));
//       for(int j = 0;j<res.length;j++) {
//    	   for(int m = 0;m<res[0].length;m++) {
//    		   System.out.println(res[j][m]);
//    	   }
//       }
       int[] out = new int[N+1];
       int count = 0;
//       for(int s = res[0][0];s<=res[0][1];s++) {
//    	   out[s]=1;
//    	   count++;
//       }
//       for(int j = 0;j<res.length;j++) {
//    	   int temp = res[j][1];
//    	   if(out[temp]==0&&temp>=res[j][0]) {
//    		   out[temp]=1;
//    		   count++;
//    		   temp--;
//    	   }
//    	   System.out.println(count);
//       }
       
    	   for(int j = 0;j<res.length;j++) {
    		   
    		   for(int m = res[j][0];m<=res[j][1];m++) {
        		   out[m] = 1;
        	   }
    		   count = 0;
    		   for(int n = 0;n<out.length;n++) {
    			   if(out[n]==0) {
    				   count++;
    			   }
    			  
    		   }
        	   System.out.println(count);
           }
       
       
       
    }

}
