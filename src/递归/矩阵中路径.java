package 递归;

public class 矩阵中路径 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean hasPath(char[][] matrix, int rows, int cols, String str)
    {
		if(matrix==null||rows < 1||cols<1||str == null) return false;
		boolean[][] visited = new boolean[rows][cols];
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				if(hasPathCore(matrix,i,j,str,visited)) {
					return true;
				}
			}
		}
		return false;
    }

	
	
	private boolean hasPathCore(char[][] matrix, int rows, int cols, String str, boolean[][] visited) {
		if(str.length()==0) {
			return true;
		}
		boolean res = false;
		if(rows>=0&&rows<matrix.length&&cols>=0&&cols<matrix[0].length&&str.charAt(0)==matrix[rows][cols]&&!visited[rows][cols]) {
			visited[rows][cols] = true;
			res = hasPathCore(matrix,rows,cols-1,str.substring(1, str.length()),visited)||
					hasPathCore(matrix,rows,cols+1,str.substring(1, str.length()),visited)||
					hasPathCore(matrix,rows-1,cols,str.substring(1, str.length()),visited)||
					hasPathCore(matrix,rows+1,cols-1,str.substring(1, str.length()),visited);
			if(res==false) {
				visited[rows][cols] = false;
			}
		}
		return res;
	}

}
