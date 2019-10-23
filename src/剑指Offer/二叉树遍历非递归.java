package 剑指Offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class 二叉树遍历非递归 {
	public List<Integer> inorder(TreeNode root){
		List<Integer> res = new LinkedList<Integer>();
		if(root==null) return res;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.add(root);
		TreeNode temp;
		while(!s.isEmpty()) {
			temp = s.pop();
			res.add(temp.val);
			if(temp.right!=null) {
				s.push(temp.right);
			}
			if(temp.left!=null) {
				s.push(temp.left);
			}
		}
		return res;
	}
	
	
	public List<Integer> postorder(TreeNode root){
		LinkedList<Integer> res = new LinkedList<Integer>();
		if(root==null) return res;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode temp;
		while(!s.isEmpty()) {
			temp = s.pop();
			res.addFirst(temp.val);
			if(temp.left!=null) {
				s.push(temp.left);
			}
			if(temp.right!=null) {
				s.push(temp.right);
			}
		}
		return res;
	}
	
	
	public List<Integer> midorder(TreeNode root){
		LinkedList<Integer> res = new LinkedList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode temp;
		while(!s.isEmpty()||root!=null) {
			while(root!=null) {
				s.push(root);
				root = root.left;
			}
			if(!s.isEmpty()) {
				temp = s.pop();
				res.add(temp.val);
				root = temp.left;
			}
		}
		return res;
	}
	
	public List<Integer> levelorder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		LinkedList<Integer> res = new LinkedList<Integer>();
		if(root==null) return res;
		q.add(root);
		TreeNode temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			res.add(temp.val);
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
