
public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		System.out.println(Sqrt(input));

	}

	
	private static double Sqrt(int x) {
		// TODO Auto-generated method stub
		if(x==0) {
			return 0;
		}
		double left = 0;
		double right = (double)x;
		while(left<right) {
			double mid = (left+right)/2.0;
			if(Math.abs(x-mid*mid)<0.0001) {
				return mid;
			}else if(x < mid*mid) {
				right = mid;
			}else {
				left = mid;
			}
		}
		return left;
	}

}
