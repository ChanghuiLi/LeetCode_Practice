import java.text.DecimalFormat;
import java.util.Scanner;

public class Main平安 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
        String[] str = line.split(" ");
        int [] num=new int[str.length];
    	for(int i=0; i<num.length; i++){
        	num[i]=Integer.parseInt(str[i]);
        }
    	double start = 0;
    	double end = num[0];
    	double mid = 0;
    	while(Math.abs(end-start)>0.000001) {
    		mid = (start+end)/2;
    		if(Math.pow(mid, num[1])>num[0]) {
    			end = mid;
    		}else {
    			start = mid;
    		}
    		
    	}
    	DecimalFormat data = new DecimalFormat("#.000000");
    	System.out.println(data.format(end));

	}

}
