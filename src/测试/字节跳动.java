package 测试;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
    public int Score(int n, int[][] nums){
		 int[] temp = nums[0];
		 int[] temp2 = nums[1];
		 int[] Me = Arrays.sort(temp);
		 int[] Other = Arrays.sort(temp2);
		    int res = 0;
		    for(int j = n-1,k = n-1;j>=0&&k>=0;j--){
		        while(Me[j]<=Other[k]&&k>=0){
		            k--;
		        }
		        if(k<0){
		            break;
		        }
		        if(Me[j]>Other[k]&&k>=0&&j>=0){
		            res++;
		            k--;
		        }
		    }
		    return res;
	 }
    //输入一个元素，他的阶数为n，求和。
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        int[][] nums = new int[2][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        } 
        int[] Me = nums[0];
		int[] Other = nums[1];
		Arrays.sort(Me);
		Arrays.sort(Other);
		int res = 0;
	    for(int j = n-1,k = n-1;j>=0&&k>=0;j--){
	        while(Me[j]<=Other[k]&&k>=0){
	            k--;
	        }
	        if(k<0){
	            break;
	        }
	        if(Me[j]>Other[k]&&k>=0&&j>=0){
	            res++;
	            k--;
	        }
	    }
	    System.out.println(res);
    }
    
}
public class Main341{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
    }
}
public class 字节跳动 {
	
}
