package 百度;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.sun.tools.classfile.StackMapTable_attribute.same_frame;
public class 两个叶节点最短路径_最小公共祖先 {
	public class TreeNodeF{
		int val;
		TreeNodeF right;
		TreeNodeF left;
		TreeNodeF father;
		TreeNodeF(int x){
			this.val = x;
		}
	}
	public TreeNodeF findfather1(TreeNodeF root, TreeNodeF p, TreeNodeF q) {
		TreeNodeF res = null;
		Stack<TreeNodeF> sp = new Stack<TreeNodeF>();
		Stack<TreeNodeF> sq = new Stack<TreeNodeF>();
		while(p!=null) {
			sp.push(p);
			p = p.father;
		}
		while(q!=null) {
			sp.push(q);
			q = q.father;
		}
		while(sp!=null||sq!=null) {
			TreeNodeF tempp = sp.peek();
			TreeNodeF tempq = sq.peek();
			if(tempp==tempq) {
				res = tempq;
			}else {
				return res;
			}
			
		}
		return res;
	}
	//递归
	public TreeNode findfather2(TreeNode root,TreeNode p,TreeNode q) {
		if(root == null) return null;
		if(root == p||root==q) return root;
		TreeNode left = findfather2(root.left,p,q);
		TreeNode right = findfather2(root.right,p,q);
		if(left!=null&&right!=null) {
			return root;
		}else if(left!=null&&right==null){
			return root.left;
		}else if(left==null&&right!=null){
			return root.right;
		}
		return null;
	}
	//非递归
	public TreeNode findfather3(TreeNode root,TreeNode p,TreeNode q) {
		if(root == null) return null;
	}
	public Stack<TreeNode> presearch1(TreeNode root,TreeNode p){
		Stack<TreeNode> res = new Stack<TreeNode>();
		while(root!=null||!res.isEmpty()) {
			while(root!=null) {
				if(root==p) {
					return res;
				}else {
					res.push(root);
				}
				
			}
			if(!res.isEmpty()) {
				TreeNode temp = res.pop();
				root = temp.right;
			}
		}
		
		return res;
	}
	private TreeNode findfather(TreeNode n, TreeNode p, TreeNode q) {
		if(n==null) return null;
		if(n==p||n==q) return n;
		
		TreeNode left = findfather(n.left,p,q);
		TreeNode right = findfather(n.right,p,q);
		if(left!=null&&right!=null) {
			return n;
		}else if(left!=null&&right==null) {
			return n.left;
		}else if(right!=null&&left==null) {
			return n.right;
		}
		return null;
	}
	
	public LinkedList<TreeNode> helper(TreeNode n, TreeNode p, TreeNode q){
		TreeNode node = findfather(n,p,q);
		//中序遍历用栈找到路径
		Stack<TreeNode> s1 = presearch1(node.left,n);
		Stack<TreeNode> s2 = presearch1(node.right,n);
		List<TreeNode> res = new ArrayList<TreeNode>();
		Stack<TreeNode> s3 = null;
		while(!s1.isEmpty()) {
			s3.push(s1.pop());
		}
		while(!s3.isEmpty()) {
			res.add(s3.pop());
		}
		res.add(n);
		
		while(!s2.isEmpty()) {
			res.add(s2.pop());
		}
		return (LinkedList<TreeNode>) res;
	}
	private Stack<TreeNode> presearch(TreeNode root, TreeNode n) {
		// TODO Auto-generated method stub
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(root);
		while(root!=null||!s1.isEmpty()) {
			if(root==n) {
				return s1;
			}
			while(root!=null) {
				s1.push(root);
				root = root.left;
			}
			if(root==null) {
				root = s1.pop();
				root = root.right;
			}
		}
		return null;
	}
	
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
