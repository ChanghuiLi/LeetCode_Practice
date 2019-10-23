package Important;

import java.util.LinkedList;
import java.util.Queue;

//注意数组边界问题，数组的最优一个元素是grid.length-1.
public class island {
	public int numIslands(char[][] grid) {
        if(grid.length==0||grid==null) return 0;
        int res = 0;
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length;j++) {
        		if(grid[i][j]== '1') {
        			grid = DFSfill(grid,i,j);
        			grid = BFSfill(grid,i,j);
        			res++;
        		}
        	}
        }
        return res;
    }

	private char[][] BFSfill(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[]{i,j});
		grid[i][j] = '0';
		while(!q.isEmpty()) {
			int[] temp = q.poll();
			//分别对上下左右分别判断
			if(grid[temp[0]+1][temp[1]] == '1') {
				q.offer(new int[] {temp[0]+1,temp[1]});
			}
			if(grid[temp[0]][temp[1]+1] == '1') {
				q.offer(new int[] {temp[0],temp[1]+1});
			}
			if(grid[temp[0]-1][temp[1]] == '1') {
				q.offer(new int[] {temp[0]-1,temp[1]});
			}
			if(grid[temp[0]][temp[1]-1] == '1') {
				q.offer(new int[] {temp[0],temp[1]-1});
			}
		}
		return grid;
	}

	private char[][] DFSfill(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		grid[i][j] = '0';
		//对上下左右四个方向做搜索。
		if(i-1>=0&&grid[i-1][j]=='1') {
			DFSfill(grid,i-1,j);
		}
		if(i+1<grid.length&&grid[i+1][j]=='1') {
			DFSfill(grid,i+1,j);
		}
		if(j-1>=0&&grid[i][j-1]=='1') {
			DFSfill(grid,i,j-1);
		}
		if(j+1<grid[i].length&&grid[i][j+1]=='1') {
			DFSfill(grid,i,j+1);
		}
		return grid;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
