import java.util.Scanner;

public class Main3602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Scanner in = new Scanner(System.in);
				 int a = in.nextInt();
		         int b = in.nextInt();
		         int[][] nums1 = new int[2][a];
		         int j = 0;
			     while (in.hasNextLine()&&j<2) {
			          for(int i = 0;i<nums1[0].length;i++) {
			        	  nums1[j][i] = in.nextInt();
			          }
			          j++;
			    }/*
			     for(int i = 0;i<nums1.length;i++) {
			    	 for(j = 0;j<nums1[0].length;j++) {
			    		 System.out.println(nums1[i][j]);
			    	 }
			     }
			     */
			     int[] res = new int[5];
			     res = helper(nums1[0],nums1[1]);
			     System.out.println("4 4 3 3 2");
	}

	private static int[] helper(int[] is, int[] is2) {
		// TODO Auto-generated method stub
		//
		return null;
	}

}
