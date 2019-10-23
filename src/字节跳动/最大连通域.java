package 字节跳动;

import java.util.Scanner;

public class 最大连通域 {
	public static int helper(int[][] nums) {
		int res = 0;
		boolean[][] visited = new boolean[nums.length][nums.length];
		for(int i = 0;i<nums.length;i++) {
			for(int j = 0;j<nums[0].length;j++) {
				if(nums[i][j]==1&&visited[i][j]==false) {
					int count = 0;
					int temparea = dfs(nums,i,j,visited);
					res = Math.max(temparea, res);
				}
			}
		}
		return res;
	}

	private static int dfs(int[][] nums, int i, int j, boolean[][] visited) {
		// TODO Auto-generated method stub
		visited[i][j] = true;
		//上下左右四个方向进行搜索
		int count = 1;
		if(i<nums.length&&nums[i+1][j]==1&&visited[i+1][j] == false) {
			count +=dfs(nums,i+1,j,visited);
//			System.out.println(count);
		}
		
		if(j<nums[0].length&&nums[i][j+1]==1&&visited[i][j+1] == false) {
			count +=dfs(nums,i,j+1,visited);
//			System.out.println(count);
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] nums = new int[10][10];
	    for(int i = 0; i < 10; i++){
	        for(int j = 0; j < 10; j++){
	            nums[i][j] = 0;
	        }
	    }
	    nums[1][1] =1;
	    nums[1][2] =1;
	    nums[2][2] =1;
	    nums[5][6] =1;
	    nums[6][6] =1;
	    nums[5][7] =1;
	    nums[5][8] =1;
	    for(int i = 0;i<nums.length;i++) {
	    	for(int j = 0;j<nums.length;j++) {
	    		System.out.print(nums[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    int a = helper(nums);
		System.out.println(a);
	}

}
