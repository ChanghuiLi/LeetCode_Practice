package 字节跳动;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 寻找舞伴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int[][] nums = new int[a][b];
		for(int i = 0;i<a;i++) {
			for(int j = 0;j<b;j++) {
				nums[i][j] = in.nextInt();
			}
		}
		int k = in.nextInt();
		int[][] numsk = new int[k][4];
		for(int i = 0;i<k;i++) {
			numsk[i][0] = in.nextInt();
			numsk[i][1] = in.nextInt();
			numsk[i][2] = in.nextInt();
			numsk[i][3] = in.nextInt();
		}
		int a1 = in.nextInt();
		int b1 = in.nextInt();
		for(int i = 0;i<k;i++) {
			Solution(nums,numsk[i]);
		}

	}

	private static void Solution(int[][] nums2, int[] k) {
		if(nums2[k[0]-1][k[1]-1]==nums2[k[2]-1][k[3]-1]) {
			int limit = 0;//限制转弯的次数2
			//使用广度有限遍历
			int[][] nums = new int[nums2.length][nums2[0].length];
			for(int i = 0;i<nums.length;i++) {
				for(int j = 0;j<nums[0].length;j++) {
					nums[i][j] = nums2[i][j];
				}
			}
			Queue<Integer> q = new LinkedList<Integer>();
			q.offer(k[0]-1);
			q.offer(k[1]-1);
			int tag = 1;
			while(!q.isEmpty()) {
				int sx = q.poll();
				int sy = q.poll();
				//上下左右入队；
				if(sx+1<nums.length) {
					if(nums[sx+1][sy]==0) {
						q.add(sx+1);
						q.add(sy);
						nums[sx+1][sy] = -1;
					}else if(sx+1 == k[2]-1&&sy==k[3]-1){
						System.out.println("YES");
						tag = 0;
						break;
					}
					
				}
				if(sx-1>=0) {
					if(nums[sx-1][sy]==0) {
						q.add(sx-1);
						q.add(sy);
						nums[sx-1][sy] = -1;
					}else if(sx-1 == k[2]-1&&sy==k[3]-1){
						System.out.println("YES");
						tag = 0;
						break;
					}
				}
				if(sy+1<nums[0].length) {
					if(nums[sx][sy+1]==0) {
						q.add(sx);
						q.add(sy+1);
						nums[sx][sy+1] = -1;
					}else if(sx == k[2]-1&&sy+1==k[3]-1){
						System.out.println("YES");
						tag = 0;
						break;
					}
					
				}
				if(sy-1>=0) {
					if(nums[sx][sy-1]==0) {
						q.add(sx);
						q.add(sy-1);
						nums[sx][sy-1] = -1;
					}else if(sx == k[2]-1&&sy-1==k[3]-1){
						System.out.println("YES");
						tag = 0;
						break;
					}
					
				}
			}
			if(tag==1) {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
		
		
	}

}
