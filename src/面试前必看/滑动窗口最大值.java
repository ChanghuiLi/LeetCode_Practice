package 面试前必看;

import java.util.ArrayDeque;

public class 滑动窗口最大值 {
	public static int[] max(int[] nums,int w) {
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		if(nums == null||nums.length <= 2||nums.length <= w) return nums;
		int[] res = new int[nums.length-w+1];
		for(int i = 0; i < nums.length; i++) {
			//将小于双端队列中的元素去除
			while(!q.isEmpty()&&nums[q.peekLast()]<=nums[i]) {
				q.pollLast();
			}
			q.addLast(i);
			//控制双端队列中元素的数目
			while(q.peek()<=i-w) {
				q.poll();
			}
			if((i-w+1)>=0) {
				res[i-w+1] = nums[q.peek()];
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
