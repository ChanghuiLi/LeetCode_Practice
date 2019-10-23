import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VIVO01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,3};
		System.out.println(Solution2(a));

	}
	public static int Solution(int[] input) {
		int[] dp = new int[input.length];
		dp[0] = 0;
		for(int i = 1;i<dp.length;i++) {
			int temp = Integer.MAX_VALUE;
			for(int j = 0;j<i;j++) {
				if((input[j]+j)>=i) {
					temp = Math.min(temp, dp[j]);
				}
			}
			dp[i] = temp+1;
			System.out.println(dp[i]);
		}
		
		if(dp[dp.length-1]==0) {
			return -1;
		}else if(dp.length==0){
			return 0;
		}else {
			return dp[dp.length-1];
		}
		
	}
	public static String Solution2(int[] input) {
		int[] res = new int[input[0]+1];
		for(int i = 1;i<=input[0];i++) {
			res[i] = i;
		}
		List<Integer> out = new ArrayList<Integer>();
		int count = 0;//计数
		int tag = 1;//标记检索位
		int num = 0;//报数
		while(count!=input[0]) {
			if(res[tag]!=0) {
				num++;
			}
			if(tag<=input[0]&&res[tag]!=0&&num%input[1]==0) {
				out.add(res[tag]);
				count++;
				res[tag] = 0;
			}
			tag++;
			if(tag>input[0]) {
				tag = 1;
			}
		}
		StringBuffer tempout = null;
		for(int prt:out) {
			System.out.println(prt);
//			tempout.append(String.valueOf(prt));
		}
		return null;
	}

}
