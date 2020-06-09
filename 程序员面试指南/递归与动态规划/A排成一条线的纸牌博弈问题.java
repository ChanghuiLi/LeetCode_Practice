package 递归与动态规划;

public class A排成一条线的纸牌博弈问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,100,4};
		System.out.println(DpSolution(a));

	}
	//递归的方法
	public static int Solution1(int[] nums) {
		
		return Math.max(f(nums, 0 ,nums.length-1), s(nums,0,nums.length-1));
	}
	
	//绝顶聪明的人先拿能获得什么分数
	private static int f(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {
			return nums[i];
		}
		return Math.max(nums[i]+s(nums,i+1,j), nums[j]+s(nums,i,j-1));
	}
	
	//决定聪明的后拿能获得什么分数。
	private static int s(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j) {
			return 0;
		}
		return Math.min(f(nums,i+1,j), f(nums,i,j-1));
	}
	
	//需要定义两个状态；一个记录f(i,j),一个记录s(i,j)
	//res = Math.max(f(0,len),s(0,len))
	public static int DpSolution(int[] nums) {
		int[][] f = new int[nums.length][nums.length];
		int[][] s = new int[nums.length][nums.length];
//		根据递推公式，从dp数组的第二维度开始递推。
		for(int j = 0; j < nums.length; j++) {
			f[j][j] = nums[j];
			for(int i = j-1;i>=0;i--) {
				f[i][j] = Math.max(nums[i]+s[i+1][j], nums[j]+s[i][j-1]);
				s[i][j] = Math.min(f[i+1][j], f[i][j-1]);
			}
		}
		return Math.max(f[0][nums.length-1], s[0][nums.length-1]);
	}
	
//	public static int DpSolution2(int[] nums) {
//		int[][] f = new int[nums.length][nums.length];
//		int[][] s = new int[nums.length][nums.length];
//		for(int i = 0; i < nums.length;i++) {
//			f[i][i] = nums[i];
//			for(int j = i+1; j<nums.length;j++) {
//				f[i][j] = Math.max(nums[i]+, b)
//			}
//		}
		
	}
