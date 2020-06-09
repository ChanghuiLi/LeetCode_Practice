package 数组和矩阵问题;

public class 正方形矩阵顺时针旋转90度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[][] {{1,2,3,0},{4,5,6,0},{7,8,9,0},{6,6,6,6}};
		Solution(m);

	}
	
	public static void Solution(int[][] matrix){
		int x1 = 0;
		int y1 = 0;
		int x2 = matrix[0].length-1;
		int y2 = matrix.length-1;
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		while(x1 < x2) {
			helper(matrix,x1++,x2--,y1++,y2--);
		}
		
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void helper(int[][] m, int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		int len = x2-x1;
		int temp = 0;
		for(int i = 0;i<len;i++) {
			temp = m[x1][y1+i];
			m[x1][y1+i] = m[x2-i][y1];
			m[x2-i][y1] = m[x2][y2-i];
			m[x2][y2-i] = m[x1+i][y2];
			m[x1+i][y2] = temp;
		}
		
		
	}

}
