import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ebay {

//	public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       int N = in.nextInt();
//       
//       int[] res = new int[N];
//       for(int i = 0;i<N;i++) {
//    	   res[i] = in.nextInt();
//       }
//      
//       int M = in.nextInt();
//       for(int i = 0;i<M;i++) {
//    	   int L = in.nextInt();
//    	   int R = in.nextInt();
//    	   System.out.println(helper(res,L-1,R-1));
//    	   
//       }
//    }
//
//	private static int helper(int[] res, int l, int r) {
//		// TODO Auto-generated method stub
//		HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
//		int out = 0;
//		for(int i = l;i<=r;i++) {
//			if(s.containsKey(res[i])) {
//				s.put(res[i],s.get(res[i])+1);
//			}else {
//				s.put(res[i], 1);
//			}
//		}
//		for(int key:s.keySet()) {
//			if(s.get(key)==1) {
//				out++;
//			}
//		}
//		return out;
//	}
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       String s = in.nextLine();
	       int[] out = new int[s.length()];
	       String s1 = "";
	       StringBuffer a = new StringBuffer(s1);
	       for(int t:out) {
	    	   a.append(t);
	       }
	       System.out.println(a.toString());
	    }

}
