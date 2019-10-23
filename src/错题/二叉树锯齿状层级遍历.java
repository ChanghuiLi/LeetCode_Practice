package 错题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树锯齿状层级遍历 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int level = 0;
		TreeNode tempNode;
		int levelsize = 0;
		while(!q.isEmpty()) {
			LinkedList<Integer> templist = new LinkedList<Integer>();
			levelsize = q.size();
			for(int i = 0;i<levelsize;i++) {
				TreeNode t = q.poll();
				if(level%2==0) {
					templist.add(t.val);
				}else {
					templist.addFirst(t.val);
				}
				if(t.left!=null) {
					q.add(t.left);
				}
				if(t.right!=null){
					q.add(t.right);
				}
			}
			level++;
			res.add(templist);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
