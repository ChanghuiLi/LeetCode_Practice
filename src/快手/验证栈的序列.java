package 快手;

import java.util.Stack;

public class 验证栈的序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//两个栈的序列，一个push，一个pop，验证是否是正确的。
	public static boolean Solution(int[] push,int[] pop) {
		Stack<Integer> s = new Stack<Integer>();
		int num_value = pop.length;
		int tag = 0;
		for(int x:push) {
			s.push(x);
			while(!s.isEmpty()&&tag<num_value&&pop[tag]==s.peek()) {
				s.pop();
				tag++;
			}
		}
		return tag == num_value;
	}

}
