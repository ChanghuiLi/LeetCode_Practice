package LeetCode;

import java.util.ArrayDeque;

public class 滑动窗口最大值 {
	public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        if(nums==null||nums.length<=2) return nums;
        int[] res = new int[nums.length-k+1];
        for(int i = 0;i<nums.length;i++) {
        	//当前元素入队时，同时将他前面比他小的元素移除。
        	while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]) {
        		dq.pollLast();
        	}
        	//添加元素
        	dq.addLast(i);
        	//双端队列，判断窗口大小时候过大。
        	if(dq.peek()<=i-k) {
        		dq.poll();
        	}
        	//输出元素
        	if((i-k+1)>=0) {
        		res[i-k+1] = nums[dq.peek()];
        	}
        }
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
