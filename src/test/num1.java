package test;

import java.util.Arrays;
import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            for(int j = 0; j < n; j++){
                nums[j] = in.nextInt();
            }
        
        Arrays.sort(nums);
        double res = nums[0];
        for(int i = 1;i<nums.length;i++) {
        	res = (res+(double)nums[i])/(2.0);
        }
        System.out.println(res);
    }
}
