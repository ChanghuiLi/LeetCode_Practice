package 百度;

import Tree.Treemidpreconstruct.TreeNode;

public class 最小公共祖先 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 public TreeNode(int x) { val = x; }
	}
	//二叉搜索树的话
	public static TreeNode BSTFindFather(TreeNode node,TreeNode node1,TreeNode node2) {
		int num1 = node1.val;
		int num2 = node2.val;
		int F= node.val;
		TreeNode search = node;
		while(node!=null) {
			if(F>num1&&F>num2) {
				search = search.left;
			}
			else if(F<num2&&F<num1) {
				search = search.right;
			}else {
				return search;
			}
			
		}
		return search==null?null:search;
	}
	public class BTreeNode{
		int val;
		BTreeNode father;
		BTreeNode left;
		BTreeNode right;
		BTreeNode(int x){
			val = x;
		}
	
	public TreeNode findf(TreeNode node,TreeNode node1,TreeNode node2) {
		if(node==null||node==node1||node==node2) {
			return node;
		}
		TreeNode left = findf(node.left,node1,node2);
		TreeNode right = findf(node.right,node1,node2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
