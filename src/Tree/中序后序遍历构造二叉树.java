package Tree;

import Tree.前序和中序构造树.TreeNode;
//数组的下标一定要标记好长度。
public class 中序后序遍历构造二叉树 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length) return null;
        int len = inorder.length;
        return build(inorder,postorder,0,len-1,0,len-1);
    }

	private TreeNode build(int[] inorder, int[] postorder, int startin, int endin, int startpost, int endpost) {
		// TODO Auto-generated method stub
		if(startin>endin)	return null;
		TreeNode root = new TreeNode(postorder[endpost]);
		for(int i = endin;i>=startin;i--) {
			if(inorder[i]==root.val) {
				int len = i-startin;
				root.left = build(inorder,postorder,startin,i-1,startpost,startpost+len-1);
				root.right = build(inorder,postorder,i+1,endin,startpost+len,endpost-1);
				return root;
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
