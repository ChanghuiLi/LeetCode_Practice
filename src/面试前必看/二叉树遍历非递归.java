package 面试前必看;

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
	
	public List<Integer> post(TreeNode root){
		LinkedList<Integer> res = new LinkedList<>();
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		TreeNode temp;
		while(!s.isEmpty()){
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
	
	public int levelorder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
//		LinkedList<Integer> res = new LinkedList<Integer>();
		if(root==null) return 0;
		q.add(root);
		TreeNode temp;
		int size = 1;
		int out = root.val;
		while(!q.isEmpty()) {
			int tag = 0;
			int tempsum = 0;
			while(size>0) {
				temp = q.poll();
				tempsum = tempsum+temp.val;
//				res.add(temp.val);
				if(temp.left!=null) {
					q.add(temp.left);
					tag++;
				}
				if(temp.right!=null) {
					q.add(temp.right);
					tag++;
				}
				size--;
			}
			
			size = tag;
			out = Math.min(out, tempsum/size);
		}
		return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
