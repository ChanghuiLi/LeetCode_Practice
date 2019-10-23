import java.util.Scanner;
import java.util.Stack;

public class VIPKid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Stack<Character> s = new Stack<Character>();
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='<') {
				if(!s.isEmpty()&&s.peek()!=')'&&s.peek()!='(') {
					s.pop();
				}
			}else {
				s.push(str.charAt(i));
			}
		}
		Stack<Character> s2 = new Stack<Character>();
		while(!s.isEmpty()) {
			s2.push(s.pop());
			System.out.println(s);
			System.out.println(s2);
		}
//		System.out.println(s2);
//		System.out.println(s2);
//		System.out.println(s2);
//		while(!s.isEmpty()) {a<<b((c)<)
	//                       ))c((b
//			s2.push(s.pop());
//		}
		Stack<Character> s3 = new Stack<Character>();
		Character temp = ' ';
		while(!s2.isEmpty()) {
			temp = s2.pop();
			if(temp!=')') {
				s.push(temp);
//				System.out.println(s);
			}else {
				while(!s.isEmpty()&&s.peek()!='(') {
					s.pop();
				}
				if(!s.isEmpty()) {
					s.pop();
				}
			}
		}
		while(!s.isEmpty()) {
			s3.push(s.pop());
		}
		while(!s3.isEmpty()) {
			System.out.print(s3.pop());
		}
	}

}
