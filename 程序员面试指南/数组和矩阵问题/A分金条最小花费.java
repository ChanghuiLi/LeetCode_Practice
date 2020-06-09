package 数组和矩阵问题;

import java.util.PriorityQueue;

public class A分金条最小花费 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//哈夫曼编码问题
	public static int Solution(int[] nums) {
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		for(int i = 0;i<nums.length;i++) {
			minheap.add(nums[i]);
		}
		int ans = 0;
		int sum = 0;
		while(minheap.size()!=1) {
			sum = minheap.poll()+minheap.poll();
			ans += sum;
			minheap.add(sum);
		}
		return ans;
	}

}
