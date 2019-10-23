package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.Treemidpreconstruct.TreeNode;

public class 树深度递归和非递归 {
	public static int depth(TreeNode node) {
		if(node!=null) {
			return Math.max(depth(node.right), depth(node.left));
		}else {
			return 0;
		}
	}
	
	public static int depth2(TreeNode node) {
		if(node == null) return -1;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int level = 0;
		q.offer(node);
		int precount = 1;
		int nowcount = 0;
		
		while(!q.isEmpty()) {
			//上一次队列中元素出队并添加元素进来
			if(precount>0) {
				TreeNode temp = q.poll();
				precount--;
				if(temp.left!=null) {
					q.offer(temp.left);
					nowcount++;
				}
				if(temp.right!=null) {
					q.offer(temp.right);
					nowcount++;
				}
			}
			if(precount == 0) {
				precount = nowcount;
				nowcount = 0;
				level++;
			}
		}
		return level;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
