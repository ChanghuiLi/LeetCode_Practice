package 面试前必看;

public class 求解根号 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(S2(3));
		//System.out.println(mySqrt(3));

	}
	/*
	 * 起始的left和right定义
	 * 输入值的定义，double
	 */
	public static double S2(double x) {
		if(x<0) return -1;
		double left = 0;
		double right = (long) ((double)x/2.0)+1;
		double mid = 0;
		double res = 0;
		while(Math.abs(right-left)>0.0001) {
			mid = left+((right-left)/2.0);
			//System.out.println(mid);
			res = mid*mid;
			if(res-x>0.0001) {
				right = mid;
			}else if((res-x)<-0.0001){
				left = mid;
			}else {
				return mid;
			}
		}
		return mid;
	}
	/*
	 * 牛顿法：
	 * 一阶泰勒展开。
	 * 0 = x^2+a,求x；
	 * f(x) = f(xk)+f(xk)'(x-xk)
	 * f(x) = 0;
	 * x-xk = -f(xk)/f(xk)'
	 */
	

}
