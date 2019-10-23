package 字节跳动;

public class 寻找抖音红人 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static int helper(int[][] nums,int N) {
		int res = 0;
		int[][] temp = new int[N+1][N+1];
		for(int i = 0;i<nums.length;i++) {
			update(temp,nums[i][0],nums[i][1]);
		}
		
		for(int i = 0;i<nums.length;i++)
		
		return res;
	}

	private static void update(int[][] temp, int i, int j) {
		// TODO Auto-generated method stub
		temp[j][i] = 1;
		for(int k = 1;k<temp.length;k++) {
			if(temp[i][k]==1) {
				temp[j][k] = 1;
			}
		}
	}
	

}
