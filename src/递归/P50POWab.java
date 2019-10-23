package 递归;

public class P50POWab {
	//输入大于0
	//输入小于0
	//
	public double pow(double x, int n) {
		if( n == 0 ) return 1;
		if(n<0) {
			n = -n;
			x = 1/x;
		}
		return (n%2 == 0)? pow(x*x, n/2):x*pow(x*x, n/2);
		
    }
	public double myPow2(double x, int n) {
		if( n == 0 ) return 1;
		double res = 1;
		if(n<0) {
			n = -n;
			x = 1/x;
		}
		while(n>0) {
			if( (n&1) ==1) {
				res = res * x;
			}
			x*=x;
			n = n>>1;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(20001&1);
	}

}
