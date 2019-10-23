package Classic;

import java.util.Scanner;

public class Bag01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int bag  = in.nextInt();
        int[] temp = new int[num];
        for(int i = 0;i<num;i++){
            temp[i] = in.nextInt();
        }
        int res = dp(temp,bag);
	}

	private static int dp(int[] temp, int bag) {
		// TODO Auto-generated method stub
		int[] t = new int[bag];
		for(int i =0;i<=bag;i++) {
			int k = 0;
;			for(int j =0;j<temp.length;j++) {
				if(i==temp[j]) {
					t[i] = temp[j];
				}
				if(i<temp[j]) {
					
				}
			}
		}
		return 0;
	}

}
