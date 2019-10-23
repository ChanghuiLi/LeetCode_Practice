package 面试前必看;

public class 树的公共祖先 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null) return null;
		if(root==p||root==q) return root;
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);
		if(left!=null&&right!=null) {
			return root;
		}else if(left!=null){
			return left;
		}else if(right!=null){
			return right;
		}
		return null;
	}
	
	public TreeNode Solution(TreeNode root, TreeNode p,TreeNode q) {
		//递归终止条件
		if(root == null) return null;
		if(root==p||root==q) return root;
		//递归
		TreeNode left = Solution(root.left,p,q);
		TreeNode right = Solution(root.right,p,q);
		//返回值判定
		if(left!=null&&right!=null) {
			return root;
		}else if(left!=null) {
			return left;
		}else if(right!=null) {
			return right;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
