package LeetCode;

import java.util.ArrayList;

public class 顺时针打印矩阵 {
	public ArrayList<Integer> printMatrix(int [][] matrix){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(matrix==null) return res;
		int start = 0,col = matrix[0].length,row = matrix.length;
		while(col>start*2&&row>start*2) {
			helper(res,matrix,row,col,start);
			start++;
		}
		return res;
	}

	private void helper(ArrayList<Integer> res, int[][] matrix, int row, int col, int start) {
		// TODO Auto-generated method stub
		int endx = col-start-1;
		int endy = row-start-1;
		//第一行横向
		for(int i = start;i<=endx;i++) {
			res.add(matrix[start][i]);
		}
		
		//最后一列
		if(start<endy) {
			for(int i = start+1;start<=endy;i++) {
				res.add(matrix[i][endx]);
			}
		}
		//右到左的一行
		if(start<endy&&start<endx) {
			for(int i = endx-1;i>=start;i--) {
				res.add(matrix[endy][i]);
			}
		}
		if(start<endy-1&&start<endx) {
			for(int i = endy-1;i>start;i--) {
				res.add(matrix[i][start]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
