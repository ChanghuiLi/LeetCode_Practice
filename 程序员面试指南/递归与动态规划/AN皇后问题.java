package 递归与动态规划;

public class AN皇后问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Num(8));
	}
	
	public static int Num(int n) {
		int[] record = new int[n];
		return help(0,record,n);
	}

	private static int help(int i, int[] record, int n) {
		// TODO Auto-generated method stub
		if(i == n) {
			return 1;
		}
		int res = 0;
		//遍历每一行所有的列。
		for(int  j= 0; j<n; j++) {
			if(isVaild(record,i,j)) {
				record[i] = j;
				res += help(i+1,record,n);
			}
		}
		return res;
	}
	
	//i行j个位置
	private static boolean isVaild(int[] record, int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < i; k++) {
			if(j==record[k]||Math.abs(record[k]-j)==Math.abs(i-k)) {
				return false;
			}
		}
		return true;
	}

}
