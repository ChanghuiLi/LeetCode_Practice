package 快手;

import java.util.Stack;

public class 最大树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static TreeNode maxTree(int[] A) {
		TreeNode root = BuildTree(A,0,A.length-1);
		return root;
	}

	private static TreeNode BuildTree(int[] A, int l, int r) {
		// TODO Auto-generated method stub
		if(l>r) {
			return null;
		}
		if(l==r) {
			return new TreeNode(A[l]);
		}
		int maxindex = finmax(A,l,r);
		TreeNode  root = new TreeNode(A[maxindex]);
		root.left = BuildTree(A,l,maxindex-1);
		root.right = BuildTree(A,maxindex+1,r);
		return root;
	}

	private static int finmax(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		return 0;
	}
	//https://www.meiwen.com.cn/subject/pvgelftx.html
	public static TreeNode maxTree2(int[] A) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		for(int i = 0;i<A.length;i++) {
			TreeNode p = new TreeNode(A[i]);
			if(s.isEmpty()||s.peek().val>A[i]) {
				s.push(p);
				continue;
			}
			TreeNode top = s.pop();
			while(!s.isEmpty()&&s.peek().val<p.val) {
				TreeNode cur = s.pop();
				cur.right = top;
				cur = top;
			}
			p.left = top;
			s.push(p);
			
		}
		TreeNode root = s.pop();
		while(!s.isEmpty()) {
			TreeNode cur = s.pop();
			cur.right = root;
			cur = root;
		}
		return root;
		
	}

}
