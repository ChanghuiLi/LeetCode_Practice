package 栈和队列;

import java.util.Stack;

public class Queue_TwoStack {
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	public Queue_TwoStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	public void pushtopop() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
	}
	
	public void add(int x) {
		s1.push(x);
		pushtopop();
	}
	
	public int poll() {
		if(s1.isEmpty()&&s2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		pushtopop();
		return s2.pop();
	}
	public int peek() {
		if(s1.isEmpty()&&s2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		pushtopop();
		return s2.peek();
		
	}
	
	

}
