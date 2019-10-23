package 百度;

public class 平衡二叉树 {
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(height(root.left)-height(root.right))>1) {
        	return false;
        }else {
        	return isBalanced(root.left)&&isBalanced(root.right);
        }
    }
	public int height(TreeNode root) {
		if(root!=null) {
			return Math.max(height(root.left), height(root.right))+1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
