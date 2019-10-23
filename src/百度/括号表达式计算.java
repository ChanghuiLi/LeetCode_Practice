package 百度;

import java.util.Stack;

public class 括号表达式计算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "( 1 + 2 ) * 3 - 4 ";
		int res = expression(exp);
		System.out.println(res);

	}

	private static int expression(String exp) {
		// TODO Auto-generated method stub
		Stack<Integer> num = new Stack<Integer>();
		Stack<Character> opt = new Stack<Character>();
		String[] c = exp.split(" ");
		for(String s : c) {
			if(s.length()==0) {
				continue;
			}else if(s.charAt(0)=='+'||s.charAt(0)=='-') {
				while(!opt.isEmpty()&&(opt.peek()=='+'||opt.peek()=='-'||opt.peek()=='/'||opt.peek()=='*')) {
					process(num,opt);
				}
				opt.push(s.charAt(0));
			}else if(s.charAt(0)=='*'||s.charAt(0)=='/') {
				while(!opt.isEmpty()&&(opt.peek()=='*'||opt.peek()=='/')) {
					process(num,opt);
				}
				opt.push(s.charAt(0));
			}else if(s.charAt(0)==')') {
				while(opt.peek()!='(') {
					process(num,opt);
				}
			}else if(s.charAt(0)=='(') {
				opt.push('(');
			}else {
				num.push(Integer.valueOf(s.strip()));
			}
		}
		while(!opt.isEmpty()) {
			process(num,opt);
		}
		return num.pop();
	}

	private static void process(Stack<Integer> num, Stack<Character> opt) {
		// TODO Auto-generated method stub
		char opt1 = opt.pop();
		int num1 = num.pop();
		int num2 = num.pop();
		if(opt1=='+') {
			num.push(num1+num2);
		}else if(opt1=='-') {
			num.push(num2-num1);
		}else if(opt1=='*') {
			num.push(num1*num2);
		}else if(opt1=='/') {
			num.push(num2/num1);
		}
		
	}

}
