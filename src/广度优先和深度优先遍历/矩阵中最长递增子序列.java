package 广度优先和深度优先遍历;

public class 矩阵中最长递增子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	//暴力解法
	public int m,n;
	public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        m = matrix.length;
        n = matrix[0].length;
        int res = 0;
        for(int i = 0;i<m;i++) {
        	for(int j = 0;j<n;j++) {
        		res = Math.max(res, dfs(matrix,i,j));
        	}
        }
		return res;
    }
	private int dfs(int[][] matrix, int i, int j) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int[] d:dirs) {
			int x = i+d[0],y = j+d[1];
			if(0<=x&&x<m&&0<=y&&y<n&&matrix[x][y]>matrix[i][j]) {
				res = Math.max(res, dfs(matrix,x,y));
			}
		}
		return ++res;
	}
	//暴力+记忆化：
	public int longestIncreasingPath2(int[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        m = matrix.length;
        n = matrix[0].length;
        int[][] cashe = new int[m][n];
        int res = 0;
        for(int i = 0;i<m;i++) {
        	for(int j = 0;j<n;j++) {
        		res = Math.max(res, dfs2(matrix,i,j,cashe));
        	}
        }
		return res;
    }
	private int dfs2(int[][] matrix, int i, int j, int[][] cashe) {
		// TODO Auto-generated method stub
		if(cashe[i][j]!=0) return cashe[i][j];
		for(int[] d:dirs) {
			int x = i+d[0],y = j+d[1];
			if(0<=x&&x<m&&0<=y&&y<n&&matrix[x][y]>matrix[i][j]) {
				cashe[i][j]= Math.max(cashe[i][j], dfs2(matrix,x,y,cashe));
			}
		}
		return ++cashe[i][j];
	}
	

}
