package Tree;

public class VerifySquenceOfBST {
	//判断是否是二叉搜索树后续排列
	public boolean VerifySquenceOfBST(int [] s) {
		if(s.length==0) return false;
		if(s.length == 1) return true;
		return judge(s,0,s.length-1);
	}

	private boolean judge(int[] s, int start, int end) {
		// TODO Auto-generated method stub
		if(start >= end) {//到边界了还是要返回true；
			return true;
		}
		int i =end;
		//判断
		while(i>start&&s[i-1]>s[end]) {
			i--;
		}
		for(int j = start;j<end-1;j++) {
			if(s[j]>s[i]) {
				return false;
			}
		}
		return judge(s, start, i-1)&&judge(s, i, end-1);
	}
}
