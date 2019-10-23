import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
public class Main2323 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int[][] res = new int[a+1][b+1];
            List<Integer> res2 = new ArrayList<Integer>();
            for(int i = 1;i<=res.length;i++) {
            	for(int j = 1;j<res[0].length;j++) {
            		int temp = 1;
            		for(int k = i;i<=j;k++) {
            			temp =temp*k;
            		}
            		res2temp;
            		
            	}
            }
            
        }
    }
}

public class Mainpdd902 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
        	res[i] = sc.nextInt();
        }
        int tempsum = 0;
        for(int i = 0;i<res.length;i++) {
        	tempsum = tempsum+res[i];
        }
        int[][] temp1 = new int[2][tempsum+1];
        int tag = 0;
        int sum = res[0];
        for(int i = 1;i<=res[0];i++) {
        	temp1[tag][i] = 1;
        }
        
        for(int i = 1;i<res.length;i++) {
        	sum = sum+res[i];
        	for(int j = 0;j<=i;j++) {
        		temp1[1-tag][j] = 0;
        	}
        	for(int j = i+1;j<=sum;j++) {
        		temp1[1-tag][j] = 0;
        		for(int m = 1;m<=j&&j<=sum;++m) {
        			temp1[1-tag][j] +=temp1[tag][j-m];
        		}
        	}
        	tag = 1-tag;
        	
        }
        for(int i = 0;i<temp1[1].length;i++) {
        	System.out.println(temp1[1][i]);
        }
        int max = 0;
        int tag2 = 0;
        for(int i = res.length;i<temp1[0].length;i++) {
        	if(temp1[tag][i]>max) {
        		max = temp1[tag][i];
        		tag2 = i;
        	}
        }
        double finaltemp = (double)max/(double)tag2;
        System.out.println(finaltemp);
	}

}
