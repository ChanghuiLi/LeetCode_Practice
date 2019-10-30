package 字节跳动;

import java.util.Scanner;

public class 环形数组求最大 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
        String[] str = line.split(" ");
        int [] nums=new int[str.length];
    	for(int i=0; i<nums.length; i++){
        	nums[i]=Integer.parseInt(str[i]);
        }
    	int res = Solution(nums);
    	System.out.println(res);

	}

	private static int Solution(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length==3) return Math.max(Math.max(nums[0], nums[1]), nums[2]);
		int[] temp1 = new int[nums.length-1];
		int[] temp2 = new int[nums.length-1];
		for(int i = 0;i<nums.length-1;i++) {
			temp1[i] = nums[i];
			temp2[i] = nums[i+1];
		}
		int res1 = Maxmoney(temp1);
		int res2 = Maxmoney(temp2);
		return Math.max(res1, res2);
	}

	private static int Maxmoney(int[] temp1) {
		// TODO Auto-generated method stub
		int[] temp = new int[temp1.length];
		temp[0] = temp1[0];
		temp[1] = temp1[1];
		temp[2] = Math.max(temp1[0]+temp1[2], temp1[1]);
		int res = Math.max(Math.max(temp[0], temp[1]), temp[2]);
		for(int i = 3;i<temp1.length;i++) {
			temp[i] = temp1[i]+Math.max(temp[i-2], temp[i-3]);
			res = Math.max(res, temp[i]);
		}
 		return res;
	}

}
