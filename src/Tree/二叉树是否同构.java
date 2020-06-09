package Tree;

import Tree.前序和中序构造树.TreeNode;

public class 二叉树是否同构 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//左右子树交换也相等，思路类似。加一个判断条件。
	public boolean Solution(TreeNode t1,TreeNode t2) {
		if(t1==null&&t2==null) {
			return true;
		}else if((t1!=null&&t2==null)||(t1==null&&t2!=null)) {
			return false;
		}else if(Solution(t1.left,t2.left)&&Solution(t2.right,t1.right)) {
			return true;
		}
		return false;
	}

}
