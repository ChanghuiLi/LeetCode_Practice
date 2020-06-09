package 百度Feed流;

public class 岛屿问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int Solution(int[][] matrix) {
		int[][] tag = new int[matrix.length][matrix[0].length];
		int res = 0;
		for(int i = 0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[0].length;j++) {
				if(matrix[i][j]==1&&tag[i][j]==0) {
					bfs(matrix,tag,i,j);
					res++;
				}
			}
		}
		return res;
	}

	private static void bfs(int[][] matrix, int[][] tag, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=matrix.length||i<0||j>=matrix[0].length||j<0) {
			return;
		}
		bfs(matrix,tag,i+1,j);
		bfs(matrix,tag,i-1,j);
		bfs(matrix,tag,i,j+1);
		bfs(matrix,tag,i,j-1);
		
	}

}
