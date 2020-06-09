package 百度Feed流;

import java.util.LinkedList;
import java.util.Stack;

public class 树遍历三种方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public LinkedList<Integer> postOrder(TreeNode root){
		LinkedList<Integer> res = new LinkedList<Integer>();
		if(root==null) return res;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode temp;
		while(!s.isEmpty()) {
			temp = s.pop();
			res.addFirst(temp.x);
			if(temp.right!=null) {
				s.push(temp.left);
			}
			if(temp.left!=null) {
				s.push(temp.right);
			}
			
		}
		return res;
	}
	
	public LinkedList<Integer> inOrder(TreeNode root){
		LinkedList<Integer> res = new LinkedList<Integer>();
		if(root==null) return res;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode temp = null;
		while(!s.isEmpty()) {
			temp = s.pop();
			res.add(temp.x);
			if(temp.left!=null) {
				s.push(temp.left);
			}
			if(temp.right!=null) {
				s.push(temp.right);
			}
		}
		return res;
	}

}
