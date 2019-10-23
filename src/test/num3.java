package test;

import java.util.Arrays;
import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();//n个元素
        
        int[][] tv = new int[n][3];
        for(int i = 0; i < n; i++){
               tv[i][0] = sc.nextInt();
               tv[i][1] = sc.nextInt();
               tv[i][2] = sc.nextInt();
        }
		
        Arrays.sort(tv,(i1,i2)->Integer.compare(i1[1], i2[1]));
        for(int i = 0;i<tv.length;i++) {
        	System.out.print(tv[i][0]);
        	System.out.print(" ");
        	System.out.print(tv[i][1]);
        	System.out.print(" ");
        	System.out.println(tv[i][2]);
        	System.out.println(" ");
        }/*
        int max= 0;
        for(int j = tv.length-1;j>=tv.length-k;j--) {
        	max = max+tv[j][2];
        }
        
        if(max>=target) {
        	int tem = 0;
        	int t1 = 1;
        	for(;t1<=t&&tem<target;t++) {
        		for(int j = tv.length-1;j>=tv.length-k;j--) {
                	if((tv[j][0]*t1)<tv[j][1]) {
                		tem = tem+tv[j][0];
                	}
                	
                }
        	}
        	
        	System.out.println("YES");
        	System.out.println(t1+1);
        }else {
        	System.out.println("NO");
        	System.out.println(max);
        }*/
	}

}
