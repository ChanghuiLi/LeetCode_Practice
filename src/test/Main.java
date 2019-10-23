package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextLine()) {
			String s1 = in.nextLine();
			String[] array1 = s1.split(" ");
			int[] b = new int[array1.length];
			for(int m =0;m<b.length;m++) {
				b[m] = Integer.parseInt(array1[m]);
			}
			String s2 = in.nextLine();
			String[] array2 = s2.split(" ");
			int[] b2 = new int[array2.length];
			for(int m =0;m<b2.length;m++) {
				b2[m] = Integer.parseInt(array2[m]);
			}
			int temp = 0;
			int min = 0;
			int max = 0;
			List<Integer> res2 = new ArrayList<Integer>();
			if(b.length==1) {
				System.out.println(b[0]);
			}else {
				for(int i = b.length-1;i>=0;i--) {
					if(i==b.length-1) {
						if(b[i]<b[i-1]) {
							temp = i;
							min = b[i-1];
							max = Integer.MAX_VALUE;
							break;
						}
					}else if(i==0){
						if(b[i]>b[i+1]) {
							temp = i;
							min = Integer.MIN_VALUE;
							max =  b[i+1];
							break;
						}
					}else {
						if((b[i-1]>b[i]&&b[i]<b[i+1])||(b[i-1]<b[i]&&b[i]>b[i+1])) {
							res2.add(i);
							min = b[i-1];
							max = b[i+1];
						}
					}
					
				}
				
			}
			if(res2.size()>0) {
				for(int i = 0;i<res2.size();i++) {
					int tem = res2.get(i);
					
				}
			}
			for(int j=0;j<b.length;j++) {
				System.out.print(b[j]+" ");
			}
			System.out.println();
			for(int j=0;j<b2.length;j++) {
				System.out.print(b2[j]+" ");
			}
			System.out.println();
			System.out.println(temp+" ");
			List<Integer> res = new ArrayList<Integer>();
			int tmax = min;
			for(int j=0;j<b2.length;j++) {
				if(b2[j]<max&&b2[j]>min) {
					res.add(b2[j]);
					tmax = Math.max(tmax, b2[j]);
				}
			}
			if(res.isEmpty()) {
				System.out.println("NO");
			}else {
				b[temp] = tmax;
				for(int j=0;j<b.length;j++) {
					if(j==b.length-1) {
						System.out.print(b[j]);
					}else {
						System.out.print(b[j]+" ");
					}
					
				}
			}
			
		}
		
		
		

	}

}
