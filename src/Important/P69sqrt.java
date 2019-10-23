package Important;

public class P69sqrt {
	//二分查找
	public int mySqrt(int x) {
		int start = 0;
		int end = x;
		int mid = 0;
		while(start<end) {
			mid = (start+end)/2;
			if(mid*mid == x) {
				return mid;
			}else if(mid*mid<x) {
				start = mid;
			}else {
				end =mid;
			}
		}
		
		return mid;
    }
	//牛顿法
	//Xn+1 = Xn + (f(X)/f'(X))
	//Xn+1 = (Xn + Y0/Xn)/2。曲线逼近的方法。
}
