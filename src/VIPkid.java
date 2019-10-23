import java.text.DecimalFormat;
import java.util.Scanner;

public class VIPkid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split(" ");
            int w = in.nextInt();
            int [] num=new int[str.length];
        	for(int i=0; i<num.length; i++){
            	num[i]=Integer.parseInt(str[i]);
            }
        	float[] res = new float[num.length-w+1];
        	int start = 0;
        	int end = w-1;
        	res[0] = 0;
        	for(int i = 0;i<=end;i++) {
        		res[0] = res[0]+num[i];
        	}
        	
        	int tag = 1;
        	while(end<num.length-1) {
        		end++;
        		res[tag] = res[tag-1]-num[start]+num[end];
        		start++;
        		tag++;
        		
        		
        	}
        	DecimalFormat df = new DecimalFormat(".00");
        	for(int i = 0;i<res.length;i++) {
        		if(i!=res.length-1) {
        			System.out.print(df.format(res[i]/(double)w)+" ");
        		}else {
        			System.out.print(df.format(res[i]/(double)w));
        		}
        		
        	}
        }

	}

}
