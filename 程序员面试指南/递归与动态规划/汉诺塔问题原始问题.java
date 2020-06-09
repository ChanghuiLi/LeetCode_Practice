package 递归与动态规划;

public class 汉诺塔问题原始问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void hanoi(int n) {
		if(n>0) {
			help(n,"left","mid","right");
		}
	}

	private void help(int n, String from, String mid, String to) {
		// TODO Auto-generated method stub
		if(n==1) {
			System.out.println("move from "+from+"to "+to);
		}else {
			help(n-1,from,to,mid);
			help(1,from,mid,to);
			help(n-1,mid,from,to);
		}
		
	}

}
