package 百度;

import java.util.Scanner;

public class Mainbd {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		int n = in.nextInt();
//		int m = in.nextInt();
//		int[] count = new int[11];
//		for(int i = 0;i<n;i++) {
//			int start = in.nextInt();
//			int end = in.nextInt();
//			for(;start<=end;start++) {
//				count[start] = 1;
//			}
//		}
//		for(int k :count) {
//			System.out.println(k);
//		}
//		int res = 0;
//		for(int i = 0;i<m;i++) {
//			int temp = in.nextInt();
//			if(count[temp]==1) {
//				res++;
//			}
//		}
//		System.out.println(res);
//
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		String line = in.nextLine();
        String[] str = line.split(" ");
        int [] num=new int[str.length];
    	for(int i=0; i<num.length; i++){
        	num[i]=Integer.parseInt(str[i]);
        }
    	int[] nums = new int[num[4]];
    	for(int i = 0;i<=3;i++) {
    		nums[i] = num[i];
    	}
    	for(int i = 4;i<nums.length;i++) {
    		nums[i] = nums[i-1]+nums[i-3]+nums[i-4];
    	}
    	System.out.println((int)(nums[nums.length-1]%(Math.pow(10, 7)+7)));

	}

}
