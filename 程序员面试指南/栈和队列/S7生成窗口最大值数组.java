package 栈和队列;

import java.util.LinkedList;

public class S7生成窗口最大值数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {4,3,5,4,3,3,6,7};
		int[] res1 = Solution(a,3);
		for(int i = 0;i<res1.length;i++) {
			System.out.print(res1[i]+" ");
		}
		System.out.println();
		
		int[] res2 = Solution2(a,3);
		for(int i = 0;i<res2.length;i++) {
			System.out.print(res2[i]+" ");
		}
		

	}
	
	public static int[] Solution(int[] nums,int n) {
		LinkedList<Integer> temp = new LinkedList<Integer>();
		int[] res = new int[nums.length-n+1];
		int index = 0;
		for(int i =0; i<nums.length;i++) {
			while(!temp.isEmpty()&&nums[temp.peekLast()]<nums[i]) {
				temp.pollLast();
			}
			temp.add(i);
			if(temp.peekFirst()==i-n) {
				temp.pollFirst();
			}
			if(i>=n-1) {
				res[index++] = nums[temp.peekFirst()];
			}
		}
		return res;
	}
	public static int[] Solution2(int[] nums,int n) {
		LinkedList<Integer> temp = new LinkedList<Integer>();
		int[] res = new int[nums.length-n+1];
		int index = 1;
		
		for(int i = 0;i<n;i++) {
			while(!temp.isEmpty()&&nums[temp.peekLast()]<nums[i]) {
				temp.pollLast();
			}
			temp.addLast(i);
		}
		res[0] = nums[temp.peekFirst()];
		System.out.println(temp.peekFirst()+" "+temp.peekLast());
		
		for(int j = n;j<nums.length;j++) {
			if(temp.peekFirst()==j-n) {
				temp.pollFirst();
			}
			while(!temp.isEmpty()&&nums[temp.peekLast()]<nums[j]) {
				temp.pollLast();
			}
			temp.add(j);
			res[index++] = nums[temp.peekFirst()];
			System.out.println(temp.peekFirst()+" "+temp.peekLast());
		}
		return res;
	}

}
