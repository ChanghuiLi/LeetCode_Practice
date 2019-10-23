package LeetCode;

public class 数字反转 {
	public int reverse(int x) {
		int rev = 0;
		int pop = 0;
        while(x!=0) {
        	pop = x % 10;
        	x /= 10;
        	if(rev > Integer.MAX_VALUE/10) return 0;
        	if(rev < Integer.MAX_VALUE/10) return 0;
        	rev = rev*10+pop;
        }
        return rev;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
