package 百度;

public class 二叉树展开为链表 {
	public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        while(root.right!=null) root = root.right;
        root.right = temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
