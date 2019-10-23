package Tree;

public class 前序和中序构造树 {
	public class TreeNode {
	      int val;
	     TreeNode left;
	   TreeNode right;
	  TreeNode(int x) { val = x; }
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length!=inorder.length||preorder==null||preorder.length==0) return null;
		//循环找到节点preorder
		return build(preorder,inorder,0,0,preorder.length);
		
        
    }

	private TreeNode build(int[] preorder, int[] inorder, int startpre, int startin, int length) {
		// TODO Auto-generated method stub
		if(length==0) return null;
		int temp = preorder[startpre];
		TreeNode node = new TreeNode(temp);
		if(length == 1) return node;
		for(int i = length-1;i>=0;i--) {
			if(inorder[i+startin]==temp) {
				node.left = build(preorder,inorder,startpre+1,startin,i);
				node.right = build(preorder,inorder,startpre+i+1,startin+i+1,length-i-1);
				return node;
			}
				
			}
		return null;
		}
	}

	private int inorderfind(int[] inorder, int i) {
		// TODO Auto-generated method stub
		for(int s = 0;s<inorder.length;s++) {
			if(inorder[s]==i) {
				return s;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
