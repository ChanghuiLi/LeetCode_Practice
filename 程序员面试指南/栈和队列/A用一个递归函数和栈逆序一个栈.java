package 栈和队列;

import java.util.Stack;

public class A用一个递归函数和栈逆序一个栈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void help(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int i = Solution(s);
		help(s);
		s.push(i);
	}
	public static int Solution(Stack<Integer> s) {
		int res = s.pop();
		if(s.isEmpty()) {
			return res;
		}else {
			int pop = Solution(s);
			s.push(res);
			return pop;
		}
	}
	

}
