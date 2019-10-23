package 极客时间;
//Leetcode69题
public class 求解平方根 {
	
	//二分法
	public int mySqrt(int x) {
		long left = 0;
		long right = x/2+1;
		long mid = 0;
		while(left<right) {
			mid = (left+right)>>>1;
			long square = mid*mid;
			if(square<x) {
				left=mid;
			}else {
				right = mid;
			}
		}
		return (int) left;
	}
	
	//牛顿法——————对X^2+a = f(x)最小值点。做在一个点处泰勒展开。
	public int mySqrt2(int a) {
		long x = a;
		while(x*x>a) {
			x = (a+x*x)/(x*2);
		}
		return (int)x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
