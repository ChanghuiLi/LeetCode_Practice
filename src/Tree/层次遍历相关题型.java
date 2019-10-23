package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.Treemidpreconstruct.TreeNode;
//非递归实现和递归实现
public class 层次遍历相关题型 {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	public List<List<Integer>> levelOrder(TreeNode root){
		if(root == null) return null;
		level(root,0);
		return res;
		
	}

	private void level(TreeNode root, int level) {
		// TODO Auto-generated method stub
		if(level==res.size()) {
			res.add(new ArrayList<Integer>());
		}
		res.get(level).add(root.val);
		if(root.left!=null) {
			level(root.left,level+1);
		}
		if(root.right!=null) {
			level(root.right,level+1);
		}
	}
	//非递归实现。
	public List<List<Integer>> levelOrder2(TreeNode root){
		List<List<Integer>> res2 = new ArrayList<List<Integer>>();
		if(root==null) return res2;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int level=0;
		q.add(root);
		while(!q.isEmpty()) {
			res2.add(new ArrayList<Integer>());
			int temp = q.size();
			for(int i = 0;i<temp;i++) {
				TreeNode getNode = q.remove();
				res2.get(level).add(getNode.val);
				if(getNode.left!=null) q.add(getNode.left);
				if(getNode.right!=null) q.add(getNode.right);
			}
			level++;
		}
		
		
		return res2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
