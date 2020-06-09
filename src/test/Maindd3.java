package test;

import java.util.Scanner;

public class Maindd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] p = new int[n][3];
		for(int i = 0;i<n;i++) {
			p[i][0] = in.nextInt();
			p[i][1] = in.nextInt();
			p[i][2] = in.nextInt();
		}
		int A = 0;
		int B = 0;
		int N = 0;
		int res = 0;
		for(int i = 0;i< n;i++) {
			A = p[i][0];
			B = p[i][1];
			N = p[i][2];
			res = 0;
			for(int j = 2;j<=N;j++) {
				res = A + B;
				A = B;
				B = res;
			}
			if(N<2&&N>=0) {
				if(N==1) {
					if(B%3==0) {
						System.out.println("YES");
					}else {
						System.out.println("NO");
					}
				}
				if(N==0) {
					if(A%3==0) {
						System.out.println("YES");
					}else {
						System.out.println("NO");
					}
				}
			}else if(res%3==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}

	}

}
