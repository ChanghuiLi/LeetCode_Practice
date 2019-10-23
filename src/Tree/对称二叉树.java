package Tree;

import Tree.前序和中序构造树.TreeNode;

public class 对称二叉树 {
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return isSym(root.left,root.right);
    }

	private boolean isSym(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left==null&&right==null) {
        	return true;
        }
		if(left==null||right==null) return false;
        if(right.val!=left.val) return false;
        return right.val==left.val&&isSym(left.left,left.right)&&isSym(right.left,right.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
