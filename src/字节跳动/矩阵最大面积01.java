package 字节跳动;

import java.util.Scanner;
import java.util.Stack;

public class 矩阵最大面积01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character a = '1';
		System.out.println(Integer.valueOf(a)+1);
		
	}
	//构造直方图
	public static int Solution(int[][] nums){
		int[][] res = new int[nums.length][nums[0].length];
		for(int j = 0;j<nums[0].length;j++) {
			if (nums[0][j] == '1') {
                res[0][j] = 1;
            } else {
                res[0][j] = 0;
            }
		}
		for(int i = 1;i<nums.length;i++) {
			for(int j = 0;j<nums[0].length;j++) {
				if (nums[i][j] == '1') {
	                res[i][j]  = res[i-1][j]+1;
	            } else {
	                res[i][j] = 0;
	            }
			}
		}
		int temp = 0;
		int finalres = 0;
		for(int i = 0;i<nums.length;i++) {
			temp = Maxarea(res[i]);
			finalres = Math.max(finalres, temp);
			
		}
		return finalres;
		
	}
	//test
	//柱形图最大面积
	//方法一：遍历每一个柱形图，计算最大面积。
	//方法二：单调栈
	private static int Maxarea(int[] count) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(-1);
		int res = 0;
		for(int i = 0;i<count.length;i++) {
			while(s.peek()!=-1&&count[s.peek()]>=count[i]) {
				res = Math.max(res, count[s.pop()]*(i-s.peek()-1));
			}
			s.push(i);
		}
		while(s.peek()!=-1) {
			res = Math.max(res, count[s.pop()]*(count.length-s.peek()-1));
		}
		return res;
	}

}
