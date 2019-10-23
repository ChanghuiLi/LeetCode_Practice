package LeetCode;

public class 机器人移动路径 {
	public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] res = new boolean[rows][cols];//设计了一个标记位置，表示访问没访问过。
        int count = movecount(rows,cols,0,0,res,threshold);
        return count;
    }

	private int movecount(int rows, int cols, int i, int j, boolean[][] res, int threshold) {
		// TODO Auto-generated method stub
		int count = 0;
		//检查是否访问过
		if(check(rows,cols,i,j,res,threshold)) {
			res[i][j] = true;
			//将大问题划分成小问题。
			count = 1 + movecount(rows,cols,i-1,j,res,threshold)+
					movecount(rows,cols,i,j-1,res,threshold)+movecount(rows,cols,i+1,j,res,threshold)+movecount(rows,cols,i,j+1,res,threshold);
		}
		return count;
	}

	private boolean check(int rows, int cols, int i, int j, boolean[][] res, int threshold) {
		// TODO Auto-generated method stub
		if(i>=0&&i<rows&&j>=0&&j<cols&&res[i][j]!=true&&(getnum(i)+getnum(j))<=threshold) {
			return true;
		}
		return false;
	}

	private int getnum(int j) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(j>0) {
			sum+=j%10;
			j/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -8;
		System.out.println(a>>1);
		System.out.println(a>>1);
	}

}
