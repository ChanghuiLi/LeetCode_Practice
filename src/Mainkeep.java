import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mainkeep {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split(" ");
            int [] num=new int[str.length];
        	for(int i=0; i<num.length; i++){
            	num[i]=Integer.parseInt(str[i]);
            }
        	int count = (num[0]*(num[0]-1))/2;
        	int[] res = new int[count];
        	for(int i = 1,k = 0;i<num.length&&k<res.length;i++) {
        		for(int j = i+1;j<num.length&&k<res.length;j++) {
        			res[k] = Math.abs(num[j]-num[i]);
        			k++;
        		}
            }
            Arrays.sort(res);
            System.out.println(res.length/2);
            if(input.size()%2==1) {
            	System.out.println(res[res.length/2]);
            }else {
            	System.out.println(res[res.length/2-1]);
            }
            
        }
        

	}

}
