package LeetCode;

public class 二维数组搜索 {
	public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int raw = 0;
        while(raw<matrix.length&&col>=0) {
        	if(matrix[raw][col]==target) {
        		return true;
        	}else if(matrix[raw][col]>target) {
        		col--;
        	}else {
        		raw++;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
