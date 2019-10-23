package Bit;

import java.util.Arrays;

public class P191andP338countbit {
	 public int hammingWeight(int n) {
		 if(n==0) return 0;
		 int res = 0;
		 while(n!=0) {
			 n = n&(n-1);
			 res++;
		 }
		 return res;
	 }
	 public int[] countBits(int num) {
		 if(num==0) return new int[1];
		 
		 int[] res = new int[num+1];
		 
		 for(int i = 1;i<=num;i++) {
			 // res[i] = hammingWeight(i);
			 int temp = 0;
			 while(i!=0) {
				 i = i & (i-1);
				 temp++;
			 }
			 res[i] = temp;
		 }
		 return res;
	 }
	 
	 
		    
}
