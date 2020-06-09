package 栈和队列;

import java.util.Stack;

public class 单调栈结构 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3,4,1,5,6,2,7};
		int[][] res = Solution(a);
		for(int i = 0;i<res.length;i++) {
			
				System.out.println("  "+res[i][0]+"  "+res[i][1]);
			
		}

	}
	public static int[][] Solution(int[] nums) {
		int[][]	res = new int[nums.length][2];
		Stack<Integer> s = new Stack<Integer>();
		s.push(-1);
		int temp = 0;
		for(int i = 0;i<nums.length;i++) {
			while(s.peek()!=-1&&nums[i]<=nums[s.peek()]) {
				temp = s.pop();
				res[temp][1] = i;
				res[temp][0] = s.peek();
			}
			s.push(i);
		}
		while(s.peek()!=-1) {
			temp = s.pop();
			res[temp][1] = -1;
			res[temp][0] = s.peek();
		}
		return res;
		
	}

}
