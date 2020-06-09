package 栈和队列;

import java.util.Stack;

public class MiniStack {
	private Stack<Integer> stackDate;
	private Stack<Integer> stackMin;
	public MiniStack() {
		this.stackDate = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	
	public void push(int x) {
		stackDate.push(x);
		if(stackMin.isEmpty()) {
			stackMin.push(x);
		}else if(x<=stackMin.peek()){
			stackMin.push(x);
		}
		
	}
	public int pop() {
		int val = stackDate.pop();
		if(val == stackMin.peek()) {
			stackMin.pop();
		}
		return val;
	}
	
	public int getmini() {
		
		return stackMin.peek();;
	}

}

