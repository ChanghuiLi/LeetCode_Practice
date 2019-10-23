import java.util.Scanner;

public class 微软 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for(int i = n-1;i>0;i--) {
        	int tempmax = h[i];
        	for(int j = i-1;j>=0;j--) {
        		if(h[j]>=tempmax) {
        			res[j]++;
        			break;
        		}
        	}
        }
        int max = 0;
        int output = 0;
        for(int i = 0;i<res.length;i++) {
        	if(res[i]>max) {
        		max = res[i];
        		output = i;
        	}
        	System.out.println(res[i]);
        }
        System.out.println(h[output]);

	}

}
