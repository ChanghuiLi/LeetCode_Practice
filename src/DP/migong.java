package DP;

public class migong {
	public int search(int[][] grid) {
		
		
		
		
		for(int i = 0;i<grid.length;i++) {
			for(int j =0;j<grid[i].length;j++) {
				if(i==1&&j==1) {
					grid[i][j] = 1;
				}
				//判断是不是空地//边界条件。
				grid[i][j] = grid[i-1][j]+grid[i][j-1];
				//是空地则为0；
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
