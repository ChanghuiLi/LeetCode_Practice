import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 字节跳动2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int res = 0;
		Queue<Integer> x = new LinkedList<Integer>();
		Queue<Integer> y = new LinkedList<Integer>();
		Queue<Integer> z = new LinkedList<Integer>();
		Queue<Integer> ans = new LinkedList<Integer>();
		x.add(a);y.add(0);z.add(0);ans.add(0);
		if(d>Math.max(a, Math.max(b, c))) {
			res = -1;
		}else {
			
		}

	}

}
