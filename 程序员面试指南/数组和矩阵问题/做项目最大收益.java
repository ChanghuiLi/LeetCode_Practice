package 数组和矩阵问题;

import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;


public class 做项目最大收益 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int[] cost = {5,4,1,2};
		int[] profit = {3,5,3,2};
		Solution1(3,2,cost,profit);

	}
	public static int Solution1(int m, int n, int[] cost,int[] profit) {
		int[][] costget= new int[cost.length][2];
		for(int i = 0;i<cost.length;i++) {
			costget[i][0] = cost[i];
			costget[i][1] = cost[i]-profit[i];
			System.out.println(costget[i][0]+"  "+costget[i][1]);
		}
		for(int i = 0;i<cost.length;i++) {
			
		}
		Arrays.sort(costget,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1,int[] o2) {
				return o1[0]-o2[0];
			}
		});
		
		return 0;
		
	}

}
