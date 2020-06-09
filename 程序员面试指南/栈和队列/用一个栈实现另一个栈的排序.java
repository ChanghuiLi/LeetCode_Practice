package 栈和队列;

import java.util.Stack;

public class 用一个栈实现另一个栈的排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Solution(Stack<Integer> s) {
		Stack<Integer> help = new Stack<Integer>();
		while(!s.isEmpty()) {
			int cur = s.pop();
			while(!help.isEmpty()&&cur>help.peek()) {
				s.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.isEmpty()) {
			s.push(help.pop());
		}
	}

}
