package LeetCode;

public class 对称二叉树 {
	public boolean sys(TreeNode root) {
		return helper(root,root);
	}

	private boolean helper(TreeNode root, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root==null&&root2==null) return true;
		if(root==null||root2!=null) return false;
		if(root.val!=root2.val) return false;
		if(root.val==root2.val) return true;
		return helper(root.left,root2.right)&&helper(root.right,root.left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
