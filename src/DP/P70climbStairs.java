package DP;

public class P70climbStairs {
	public int climbStairs(int n) {
		if(n<=2) return n;
		int preonestep = 1;
		int pretwostep = 2;
		int res = 0;
		for(int i = 3;i<=n;i++) {
			res = preonestep+pretwostep;
			preonestep = pretwostep;
			pretwostep = res;
		}
		return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
