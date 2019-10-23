package Tree;

import java.util.ArrayList;
//一直前序和中序遍历构建树。
public class Treemidpreconstruct {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		
		TreeNode res = constructTree(pre,0,pre.length-1,in,0,in.length-1);
		return res;
	}
	private TreeNode constructTree(int[] pre, int startpre, int endpre, int[] in, int startin, int endin) {
		// TODO Auto-generated method stub
		//边界条件
		if(startpre>endpre||startin>endin) {
			return null;
		}
		//找到pre当前节点
		TreeNode temp = new TreeNode(pre[startpre]);
		//遍历找到左右子树，递归。
		for(int i = startin;i<=endin;i++) {
			if(in[i] == pre[startpre]) {
				temp.left = constructTree(pre,startpre+1,startpre+i-startin,in,startin,i-1);
				temp.right = constructTree(pre,startpre+i-startin+1,endpre,in,i+1,endin);
				break;
			}
		}
		
		return temp;
	}
}
