package Tree;

import Tree.Treemidpreconstruct.TreeNode;

public class SubTree {
	//判断是否是树的子结构。
	//对树进行遍历，找到当前节点。
	//和树节点进行比较。
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		//
		boolean res = false;
		if(root1!=null&&root2!=null) {
			if(root1.val==root2.val) {
				res = IsSimliar(root1,root2);
			}
			if(!res) {
				res = HasSubtree(root1.left,root2);
			}
			if(!res) {
				res = HasSubtree(root1.right,root2);
			}
		}
		return res;
	}

	private boolean IsSimliar(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		
		if(root1==null&&root2!=null) {
			return false;
		}
		if(root2==null) {
			return true;
		}
		if(root2.val!=root1.val) {
			return false;
		}
		return IsSimliar(root1.left,root2.left)&&IsSimliar(root1.right,root2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
