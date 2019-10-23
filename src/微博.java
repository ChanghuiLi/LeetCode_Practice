import java.util.Arrays;
import java.util.Scanner;

public class 微博{
    public static int minIncrementForUnique(int[] A) {
    	Arrays.sort(A);
    	int[] temp = new int[80001];
    	int res = 0;
    	int search = 1;
    	for(int i = 0;i<A.length;i++) {
    		A[i] = A[i]+1;
    	}
    	for(int i = 0;i<A.length;i++) {
    		if(temp[A[i]]==0) {
    			temp[A[i]]=A[i];
    		}else {
    			search = A[i]+1;
    			while(temp[A[i]]!=0&&i<A.length) {
        			res++;
        			if(temp[search]==0) {
        				temp[search]=A[i];
        				break;
        			}
        			search++;
        		}
    		}
    		
    		
    	}
    	return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split(",");
            int [] num=new int[str.length];
        	for(int i=0; i<num.length; i++){
            	num[i]=Integer.parseInt(str[i]);
            }
            System.out.println(minIncrementForUnique(num));
        }
    }
}