package 数组和矩阵问题;

public class 之形打印矩阵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i = 0;i<m.length;i++) {
			for(int j = 0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		printmatrix(m);

	}
	public static void printmatrix(int[][] m) {
		int x1 = 0;
		int y1 = m.length-1;
		int x2 = 0;
		int y2 = m.length-1;
		int endx = m[0].length-1;
		int endy = 0;
		boolean side = false;
		while(y1!=0) {
			System.out.println("x1 = "+x1+", y1 = "+y1+", x2 = "+x2+", y2 = "+y2);
			prinelevel(m,x1,y1,x2,y2,side);
			x1 = x1 == endx? endx:x1+1;
			y1 = x1 == endx? y1-1:y1;
			y2 = y2 == endy? endy: y2-1;
			x2 = y2 == endy? x2:x2+1;
//			System.out.println("x1 = "+x1+", y1 = "+y1+", x2 = "+x2+", y2 = "+y2);
			side = !side;
		}
	}
	public static void prinelevel(int[][] m, int a, int b, int c, int d, boolean side) {
		// TODO Auto-generated method stub
		int x1 = a;
		int y1 = b;
		int x2 = c;
		int y2 = d;
		if(side==false) {
			while(x1<=x2) {
				System.out.print(m[x1][y1]+" ");
				x1++;
				y1++;
			}
			
		}else {
			while(x2>=x1) {
				System.out.print(m[x2--][y2--]+" ");
			}
		}
		
	}

}
