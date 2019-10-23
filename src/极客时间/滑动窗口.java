package 极客时间;

import java.util.LinkedList;
import java.util.PriorityQueue;
//Leetcode239；
public class 滑动窗口 {
	public int[] maxSlidingWindow(int[] nums, int k) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		int[] res = new int[nums.length-k];
		for(int i = 0;i<nums.length;i++) {
			while(!q.isEmpty()&&nums[q.peekLast()]<=nums[i]) {
				q.pollLast();
			}
			q.addLast(i);
			if(q.peek()<=i-k) {
				q.poll();
			}
			if(i+1==k) {
				res[i-k+1] = nums[q.peek()];
			}
		}
		return res;
        
    }

}
