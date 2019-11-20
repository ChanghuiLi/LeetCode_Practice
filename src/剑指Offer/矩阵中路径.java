package 剑指Offer;

public class 矩阵中路径 {
	public boolean hasPath(char[][] matrix, int rows, int cols, char[] str)
    {
		if(matrix==null||rows==0||cols==0) return false;
		if(str==null||str.length==0) return true;
		boolean[][] visited = new boolean[rows][cols];
		int len = 0;
		for(int i = 0; i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				if(helper(matrix,rows,cols,i,j,len,visited,str)) {
					return true;
				}
			}
		}
		return false;
    }

	private boolean helper(char[][] matrix, int rows, int cols, int i, int j, int len, boolean[][] visited, char[] str) {
		// TODO Auto-generated method stub
		if(len==str.length) return true;
		boolean tag = false;
		if(matrix[i][j]==str[len]&&i<rows&&i>=0&&j<cols&&j>=0&&!visited[i][j]==false) {
			int templen = len++;
			visited[i][j] = true;
			tag = helper(matrix,rows,cols,i-1,j,templen,visited,str)||helper(matrix,rows,cols,i,j-1,templen,visited,str)
					||helper(matrix,rows,cols,i+1,j,templen,visited,str)||helper(matrix,rows,cols,i,j+1,templen,visited,str);//上下左右四个方向
			if(!tag) {
				templen--;
				visited[i][j] = false;
			}
		}
		return tag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
