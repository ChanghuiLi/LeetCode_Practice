import java.util.Scanner;

public class Maintenxun {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] in = new int[n];
        
        for(int i = 0; i < in.length; i++){
            in[i] = sc.nextInt();
        } 
        /*
        for(int i = 0; i < in.length; i++) {
        	System.out.print(in[i]);
        }*/
        //System.out.println();
        //System.out.println(k);
        int start = 0;
        int end = k-1;
        int res = 0;
        for(int i = 0;i<=end;i++) {
        	res = res+in[i];
        }
        System.out.println(res);
        int startres = 0;
        int temp = res;
        while(end<in.length-1) {
        	temp = res - in[start]+in[end+1];
        	if(temp<res) {
        		startres = start+1;
        	}
        	start++;
        	end++;
        }
        System.out.println(startres+1);
        }
    }

}
