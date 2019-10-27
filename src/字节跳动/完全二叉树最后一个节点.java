package 字节跳动;

import Tree.前序和中序构造树.TreeNode;

public class 完全二叉树最后一个节点 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//先计算树的高度,
	//计算左子树的高度，左子树的高度小于右子树，left搜索。
	//左子树的高度
	public TreeNode Solution(TreeNode root) {
		if(root==null||root.left==null&&root.right==null) return root;
		//计算深度；
		int depth = 0;
		TreeNode temp = root;
		while(temp!=null) {
			temp = temp.left;
			depth++;
		}
		int level = 0,tempdepth = 0;
		while(root!=null) {
			level++;
			if(level==depth) break;
			temp = root;
			if(temp.right!=null) {
				//计算左子树的高度
				TreeNode cur = temp;
				temp = temp.right;
				tempdepth = level+1;
				while(temp.left!=null) {
					tempdepth++;
					cur = temp;//cur记录的是前一个节点
					temp = temp.left;//temp是最终的节点
				}
				//左子树的高度，返回值
				if(tempdepth<depth) root = root.left;
				else if(cur.right==null) return temp;
				else root = root.right;
			}
			else {
				root = root.left;
			}
		}
		return root;
		
	}
	

}
