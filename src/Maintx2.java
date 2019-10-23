import java.util.Arrays;
import java.util.Scanner;

public class Maintx2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] count = new int[n][2];
        int money = sc.nextInt();
        money = 20;
        for(int i = 0; i < n; i++){
            count[i][0] = sc.nextInt();
        } 
        for(int i = 0; i < n; i++){
            count[i][1] = sc.nextInt();
        } 
        /*
        for(int i = 0; i < n; i++) {
        	System.out.print(count[i][0]);
        }
        System.out.println(n);
        for(int i = 0; i < n; i++) {
        	System.out.print(count[i][1]);
        }
        System.out.println(money);*/
        Arrays.sort(count,(i1,i2)->Integer.compare(i1[0],i2[0]));
        /*for(int i = 0; i < n; i++) {
        	System.out.print(count[i][0]);
        }
        System.out.println(n);
        for(int i = 0; i < n; i++) {
        	System.out.print(count[i][1]);
        }
        System.out.println(money);*/
        int res = count[0][0];
        for(int i = 1;i<count.length&&money>0;i++) {
        	while(count[i][0]==res) {
        		i++;
        	}
        	//System.out.println(i);
        	while(res<count[i][0]&&money>0) {
        		int temp1 = 0;
        		for(int p = 0;p<i;p++) {
        			temp1 = temp1+count[p][1];
        		}
        		//System.out.println(temp1);
        		money = money-temp1;
        		if(money<0) {
        			break;
        		}else {
        			res++;
        		}
        		//System.out.println("res = "+res);
        		//System.out.println("money = "+money);
        	}
        }
        int temp1 = 0;
		for(int p = 0;p<n;p++) {
			temp1 = temp1+count[p][1];
		}
        if(money>0) {
        	while(money>=0) {
        	money = money-temp1;
        	res++;
        	}
        	res--;
        }
        System.out.println(res);
        System.out.println(money);
    }

	

}
