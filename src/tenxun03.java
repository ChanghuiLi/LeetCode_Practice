import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tenxun03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int k = in.nextInt();
		List<Integer> res = new ArrayList<Integer>();
		int[][] input= new int[t][2];
		int p = 0;
		while(in.hasNextLine()&&p<t) {
			input[p][0] = in.nextInt();
			input[p][1] = in.nextInt();
			p++;
		}
		int q = 0;
        while(q<p) {
            int start = input[q][0];
            int end = input[q][1];
            int count = 0;
            for(int i = start;i<=end;i++) {
            	List<Integer> numwhite = new ArrayList<Integer>();
            	int tempK = k;
            	count++;
            	while(tempK<=i) {
            		numwhite.add(tempK);
            		tempK = tempK + k;
            		
            	}
            	if(numwhite.size()>0) {
            		for(int j:numwhite) {
                		count = count+(i-j+1);
                	}
            	}
            	
            }
            System.out.println(count);
        	q++;
        }
        /*for(int j:res) {
    		System.out.println(j);
    	}*/
	}

}
