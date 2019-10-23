import java.util.HashMap;
import java.util.Scanner;

public class Sogou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int d = in.nextInt();
		int[][] train = new int[M][d+1];
		int[][] test = new int[N][d];
		int count = 0;
//		System.out.println(M+N+d);
		HashMap<Integer,Integer> t1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> f1 = new HashMap<Integer,Integer>();
		int tnum = 0;
		int fnum = 0;
		int tnum2 = 0;
		int fnum2 = 0;
		String str2 = in.nextLine();
		for(int i = 0;i<M;i++) {
			for(int j = 0;j<d+1;j++) {
				train[i][j] = in.nextInt();
			}
		}
		String temp = "";
		for(int i = 0;i<N;i++) {
			temp = in.next();
			for(int j = 0;j<d;j++) {
				test[i][j] = Integer.parseInt(in.next());
			}
		}
		for(int i = 0;i<M;i++) {
			if(train[i][0]==0) {
				fnum++;
				for(int j = 1;j<d+1;j++) {
					if(!f1.containsKey(train[i][j])) {
						f1.put(train[i][j], 1);
					}else {
						f1.put(train[i][j], f1.get(train[i][j])+1);
					}
					fnum2++;
				}
			}else {
				tnum++;
				for(int j = 1;j<d+1;j++) {
					if(!t1.containsKey(train[i][j])) {
						t1.put(train[i][j], 1);
					}else {
						t1.put(train[i][j], t1.get(train[i][j])+1);
					}
					tnum2++;
				}
			}
		}
//		for(Object key:t1.keySet()) {
//			System.out.println((double)t1.get(key)/tnum2);
//		}
		for(int i = 0;i<N;i++) {
			if(helper(tnum2,fnum2,tnum,fnum,t1,test[i],true)>=helper(tnum2,fnum2,tnum,fnum,f1,test[i],false)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
	}

	private static double helper(int tnum2, int fnum2, int tnum, int fnum, HashMap<Integer, Integer> t1, int[] is, boolean b) {
		// TODO Auto-generated method stub
		double tag = 0;
		double sum = 1;
		if(b) {
			tag = (double)tnum/(double)(tnum+fnum);
			for(int i = 0;i<is.length;i++) {
				if(t1.containsKey(is[i])) {
					sum = sum*(double)t1.get(is[i])/tnum2;
					System.out.println(sum);
				}
			}
			if(sum==1) {
				return 0;
			}else {
				sum*=tag;
				return sum;
			}
		}else {
			tag = (double)fnum/(double)(tnum+fnum);
			for(int i = 0;i<is.length;i++) {
				if(t1.containsKey(is[i])) {
					sum = sum*(double)t1.get(is[i])/fnum2;
					System.out.println(sum);
				}
			}
			if(sum==1) {
				return 0;
			}else {
				sum*=tag;
				return sum;
			}
			
		}
	}

}
