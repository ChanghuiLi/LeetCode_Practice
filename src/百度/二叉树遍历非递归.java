package 百度;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class 二叉树遍历非递归 {
	public void inorder(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(root!=null||!s.isEmpty()) {
			while(root!=null) {
				System.out.println(root.val);
				s.push(root);
				root = root.left;
				
			}
			if(!s.isEmpty()) {
				root = s.pop().right;
			}
		}
		
	}
	public void inorder2(TreeNode root) {
		if(root==null) return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode temp;
		while(!s.isEmpty()) {
			temp = s.pop();
			System.out.println(temp.val);
			if(temp.right!=null) {
				s.add(temp.right);
			}
			if(temp.left!=null) {
				s.add(temp.left);
			}
		}
		
	}
	public void midsearch(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(root!=null||!s.isEmpty()) {
			while(root!=null) {
				s.push(root);
				root = root.left;
			}
			if(!s.isEmpty()) {
				TreeNode temp = s.pop();
				System.out.println(temp.val);
				root = temp.right;
			}
		}
	}
	public void backTree(TreeNode root) {
		if(root!=null) {
			backTree(root.left);
			backTree(root.right);
			System.out.println(root.val);
		}
	}
	//利用先序遍历。记录先序遍历的内容
	public void backTree1(TreeNode root)  {
		Stack<TreeNode> s = new Stack<TreeNode>();
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		while(root!=null||!s.isEmpty()) {
			while(root!=null) {
				s.push(root);
				s1.push(root);
				root = root.left;
			}
			if(!s.isEmpty()) {
				root = s.pop().left;
			}
		}
		while(!s1.isEmpty()) {
			System.out.print(s1.pop().val);
		}
	}
	public void backTree2(TreeNode root) {
		if(root==null) return;
		LinkedList<TreeNode> res = new LinkedList<>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.add(root);
		while(s.isEmpty()) {
			TreeNode temp = s.pop();
			res.addFirst(temp);
			if(temp.left!=null) {
				s.add(temp.left);
			}
			if(temp.right!=null) {
				s.add(temp.right);
			}
		}
		
	}
	public void level(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.println(temp.val);
			if(temp.left!=null) q.add(temp.left);
			if(temp.right!=null) q.add(temp.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
