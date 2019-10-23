package Important;

public class 丑数 {
	public static int uglynum(int num) {
		if(num<=0) return -1;
		
		int res = 1;
		int temp = 2;
		while(res<num) {
			if(isugly(temp)) {
				res++;
			}
			temp++;
		}
		return temp-1;
	}
	private static boolean isugly(int temp) {
		// TODO Auto-generated method stub
		
		while(temp%2==0) {
			temp=temp/2;
		}
		while(temp%3==0) {
			temp = temp/3;
		}
		while(temp%5==0) {
			temp = temp/5;
		}
		return temp==1?true:false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(uglynum(1500));
		System.out.print(uglynum2(1500));
	}
	
	public static int uglynum2(int num) {
		int[] res = new int[num];
		res[0] = 1;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int i = 1;
		//int nextmin = 1;
		while(i<num) {
			int nextmin = Math.min(res[n1]*2, Math.min(res[n2]*3, res[n3]*5));
			res[i] = nextmin;
			while(res[n1]*2<=res[i]) {
				n1++;
			}
			while(res[n2]*3<=res[i]) {
				n2++;
			}
			while(res[n3]*5<=res[i]) {
				n3++;
			}
			i++;
		}
		return res[num-1];
	}

}
