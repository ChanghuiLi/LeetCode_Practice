package 递归;

public class 斐波拉契 {
	public static int Fibonacci(int n) {
		if(n<=2) {
			return n;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Fibonacci(5));
	}

}
