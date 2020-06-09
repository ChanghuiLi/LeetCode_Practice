package 百度Feed流;

import java.util.LinkedList;
import java.util.Queue;

public class 树的宽度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int TreeWide(TreeNode root) {
		if(root==null) return 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int res = 1;
		TreeNode temp = null;
		int count = 1;//每一层节点数
		while(q!=null) {
			int tempcount = 0;//统计下一层节点数
			while(count > 0) {
				temp = q.poll();
				count--;
				if(temp.left!=null) {
					q.add(temp.left);
					tempcount++;
				}
				if(temp.right!=null) {
					q.add(temp.right);
					tempcount++;
				}
			}
			res = Math.max(tempcount, res);
		}
		return res;
	}

}
