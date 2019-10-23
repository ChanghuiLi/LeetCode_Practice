package 微软;

import java.util.ArrayList;
import java.util.List;

public class 相亲数 {
	public static List<int[]> Anumber(int n){
		List<int[]> res = new ArrayList<int[]>();
		int[] tempsum = new int[n];
		int temp = 0;
		for(int i = 1; i<=n; i++) {
			temp = number(i);
			tempsum[i-1] = temp;
		}
		
		for(int j = 0; j < n; j++) {
			if(tempsum[j]<=n && tempsum[j]==tempsum[tempsum[j]]) {
				res.add(new int[]{j,tempsum[j]});
			}
		}
	}

	private static int number(int i) {
		// TODO Auto-generated method stub
		int res = 0;
		//可以
		for(int j = 1; j<i; j++) {
			if(i%j==0) {
				res = res + j;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
