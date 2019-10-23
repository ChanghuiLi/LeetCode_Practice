package 剑指Offer;

public class 机器人运动范围 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int movingCount(int threshold, int rows, int cols)
    {
        //边界条件判定输入正常：
		
		boolean[][] visited = new boolean[rows][cols];
		int count = helper(threshold,rows,cols,visited,0,0);
		return count;
		
    }
	private int helper(int threshold, int rows, int cols, boolean[][] visited, int i, int j) {
		// TODO Auto-generated method stub
		int count = 0;
		//判断当前行列是否OK；check。
		return 0;
	}

}
