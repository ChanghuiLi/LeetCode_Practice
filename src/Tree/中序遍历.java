package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.前序和中序构造树.TreeNode;

public class 中序遍历 {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res  = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr = root;
		while(curr!=null||!s.isEmpty()) {
			if(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}else {
				curr = s.pop();
				res.add(curr.val);
				curr = curr.right;
			}
		}
		
		return res;
    }
	
	public List<Integer> inorderTracersal2(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr = root;
		while(curr!=null||!s.isEmpty()) {
			if(curr!=null) {
				s.push(curr);
				curr = curr.left;
			}else {
				curr = s.pop();
				res.add(curr.val);
				curr = curr.right;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
