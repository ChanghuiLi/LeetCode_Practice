import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 int a = in.nextInt();
         int b = in.nextInt();
         int[][] nums = new int[a+2][b+2];
         int j = 1;
	     while (in.hasNextLine()&&j<nums.length-1) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
	          for(int i = 1;i<nums[0].length-1;i++) {
	        	  nums[j][i] = in.nextInt();
	          }
	          j++;
	    }
	     /*
	     for(int i = 0;i<nums.length;i++) {
	    	 for(j = 0;j<nums[0].length;j++) {
	    		 System.out.println(nums[i][j]);
	    	 }
	     }
	     */
	     int m = a;
	     int n = b;
	     int area = 2*m*n;
	     for(int i = 1;i<nums.length-1;i++) {
	    	 for(j = 1;j<nums[0].length-1;j++) {
	    		 for(int p = 1;p<=nums[i][j];p++) {
	    			 if(nums[i-1][j]<p) {
	    				 area++;
	    			 }
	    			 if(nums[i+1][j]<p) {
	    				 area++;
	    			 }
	    			 if(nums[i][j-1]<p) {
	    				 area++;
	    			 }
	    			 if(nums[i][j+1]<p) {
	    				 area++;
	    			 }
	    		 }
	    	 }
	     }
	     
	     System.out.println(area);
	     
	}

}
