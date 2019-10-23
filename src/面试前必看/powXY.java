package 面试前必看;

public class powXY {
	public double myPow(double x, int n) {
		if(n==0||x==0) return 0;
		if(n<0) {
			x = 1/x;
		}
        double res = x;
        for(int i = 2; i <= n; i++) {
        	res = res * x;
        }
        return res;
    }
	//log(n)的是时间复杂度
	public double myPow2(double x, int n) {
		if(n==0) return 1;
		if(n==1) return x;
		double res = myPow(x,n>>1);
		res*=res;
		if(n%2==1) {
			res = res * x;
		}
		return res;
	}
	
	public double myPow3(double x,int n) {
		if(n==0) return 1;
		if(n==1) return n;
		double res = myPow3(x,n>>1);
		res *=res;
		if(n%2==1) {
			res = res*x;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
