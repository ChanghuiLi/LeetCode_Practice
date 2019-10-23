import java.util.Scanner;

public class Mainali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		
		*/
		if(sc.hasNextLine()) {
			int len = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			String[] array1 = s1.split(",");
			String[] array2 = s2.split(",");

			for(int i = 0;i<array1.length;i++) {
				System.out.print(array1[i]);
			}
			for(int j = 0;j<array1.length-1;j++) {
				System.out.println(array2[j]);
			}
			int res = Helper(len,min,max,array1,array2);
			System.out.println(res);
		}
		
		//System.out.println(len+" "+min+"  "+max);
		
		//
	}

	private static int Helper(int len, int min, int max, String[] array1, String[] array2) {
		// TODO Auto-generated method stub
		int[][] count = Distance(array1,array2);
		int res = 0;
		for(int i = 0;i<count.length;i++) {
			for(int j = 0;j<count[0].length;j++) {
				if(i>=min&&j>=min&&i<=max&&j<=max&&count[i][j]<=2) {
					res++;
				}
			}
		}
		return res;
	}
	private static int[][] Distance(String[] seq1, String[] seq2) {
		
        int[][] res = new int[seq1.length+1][seq2.length+1];
        for(int i = 1;i<=seq2.length;i++) {
        	res[0][i] = i;
        }
        for(int i = 1;i<=seq1.length;i++) {
        	res[i][0] = i;
        }
        for(int m = 1;m<seq1.length;m++) {
        	for(int n = 1;n<seq2.length;n++) {
        		//状态转移。
        		if(seq1[m-1].equals(seq2[n-1])) {
        			res[m][n] = res[m-1][n-1];
        		}else {
        			res[m][n] = Math.min(res[m-1][n-1], Math.min(res[m-1][n], res[m][n-1]))+1;
        		}
        	}
        }
        
        return res;
	}

}
