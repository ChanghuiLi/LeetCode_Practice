package 栈和队列;

import java.util.Stack;

public class A最大子矩阵大小_柱形图最大面积 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] {{1,0,1,1},{1,1,1,1},{1,1,1,0}};
		System.out.println(area2(a));

	}
	
	public static int area2(int[][] m) {
		int res = 0;
		int[] height = new int[m[0].length];
		for(int i = 0;i<m.length;i++) {
			for(int j = 0; j < m[0].length; j++) {
				height[j] = m[i][j] == 1? height[j]+1:0;
			}
			res = Math.max(res, area(height));
		}
		return res;
	}
	
	public static int area(int[] height) {
		int max = 0;
		Stack<Integer> s = new Stack<Integer>();
		s.push(-1);
		for(int i = 0;i<height.length;i++) {
			while(s.peek()!=-1&&height[s.peek()]>=height[i]) {
				max = Math.max(max, height[s.pop()]*(i-s.peek()-1));//i-s.peek-1;代表的是当前s。pop（）构成的最大面积
				System.out.println("peek = "+s.peek());
			}
			s.push(i);
		}
		while(s.peek()!=-1) {
			max = Math.max(max, height[s.pop()]*(height.length-s.peek()-1));
		}
		return max;
	}

}
