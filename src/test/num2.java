package test;

import java.util.Arrays;
import java.util.Scanner;

public class num2 {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        double[][] nums = new double[row][col];
        // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                nums[i][j] = in.nextInt();
            }
        } 
        double res = 0;
        double tempdeal = 0;
        for(int i = 0;i<nums.length;i++) {
        	for(int j = 0;j<nums[0].length;j++) {
        		tempdeal = deal2(nums,i,j);
        		if(res<tempdeal) {
        			res= tempdeal;
        		}
        	}
        	
        }
        System.out.println((int)res);
    }
	private static double deal2(double[][] nums, int i, int j) {
		double x1 = nums[i][j];
		double tempmax = 0;
		double tempdeal2 = 0;
		for(int k = 0;k<nums.length;k++) {
			if(k==i) {
				k++;
			}
        	for(int p = 0;p<nums[0].length&&k<nums.length;p++) {
        		if(p==j) {
        			p++;
        		}
        		if(p<nums[0].length&&k<nums.length) {
        			tempdeal2 = nums[k][p];
        			if(tempmax<tempdeal2) {
            			tempmax= tempdeal2;
            		}
        		}
        		
        	}
        	
        }
		return x1*tempmax;
	}
}
