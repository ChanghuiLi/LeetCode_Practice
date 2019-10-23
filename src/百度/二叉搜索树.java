package 百度;

public class 二叉搜索树 {
	public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

	private boolean helper(TreeNode root, Integer low, Integer high) {
		// TODO Auto-generated method stub
		if(root==null) return true;
		int val = root.val;
		if(low!=null&&val<=low) return false;
		if(high!=null&&val>=high) return false;
		if(!helper(root.right,val,high)) return false;
		if(!helper(root.left,low,val)) return false;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
