package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.Treemidpreconstruct.TreeNode;
//二叉搜索树第K大的元素。
public class 二叉搜索树第K大的元素 {
	public void midsearch(TreeNode pNode) {
		if(pNode!=null) {
			midsearch(pNode.left);
			//processing
			midsearch(pNode.right);
		}
	}
	List<Integer> res = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		
		if(root == null) return res;
		midserach(root);
		return res;
    }
	private void midserach(TreeNode root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			midsearch(root.left);
			res.add(root.val);
			midsearch(root.right);
		}
	}
	int index = 0;
	public TreeNode KthNode(TreeNode pRoot, int k) {
		if(pRoot!=null) {
			TreeNode node = KthNode(pRoot.left,k);
			if(node!=null) {
				return node;
			}
			index++;
			if(index==k) {
				return pRoot;
			}
			node = KthNode(pRoot.right,k);
			if(node!=null) {
				return node;
			}
		}
		return null;
		
	}
	public TreeNode KthNodeStack(TreeNode pRoot, int k) {
		//
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode node = pRoot;
		int count =0;
		while(node!=null&&!s.isEmpty()) {
			while(node!=null) {
				s.push(node);
				node = node.left;
			}
			node = s.pop();
			count++;
			if(count == k) {
				return pRoot;
			}
			node = node.right;
		}
		return null;
	}
	

}
