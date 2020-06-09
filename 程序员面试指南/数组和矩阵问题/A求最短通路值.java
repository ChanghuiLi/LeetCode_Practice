package 数组和矩阵问题;

import java.util.LinkedList;
import java.util.Queue;

public class A求最短通路值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int Solution(int[][] m) {
		int[][] map = new int[m.length][m[0].length];
		map[0][0] = 1;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		q.add(0);
		int res = 0;
		int r = 0,c = 0;
		while(!q.isEmpty()) {
			r = q.poll();
			c = q.poll();
			if(r==m.length&&c == m[0].length) {
				return map[r][c];
			}
			help(m[r][c],r-1,c,m,map,q);
			help(m[r][c],r+1,c,m,map,q);
			help(m[r][c],r,c+1,m,map,q);
			help(m[r][c],r,c-1,m,map,q);
		}
		return res;
		
	}

	private static void help(int i, int r, int c, int[][] m, int[][] map, Queue<Integer> q) {
		// TODO Auto-generated method stub
		if(r<0||r==m.length||c<0||c==m[0].length||m[r][c]!=1||map[r][c]!=0) {
			return;
		}
		map[r][c] = i+1;
		q.add(r);
		q.add(c);
	}

}
