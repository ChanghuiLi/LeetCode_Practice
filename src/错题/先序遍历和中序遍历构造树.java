package 错题;

public class 先序遍历和中序遍历构造树 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder == null||inorder==null||preorder.length!=inorder.length) return null;
		return build(preorder,inorder,0,0,preorder.length);
	}
	private TreeNode build(int[] preorder, int[] inorder, int startpre, int startin, int length) {
		// TODO Auto-generated method stub
		if(length==0) return null;
		int temp = preorder[startpre];
		TreeNode node = new TreeNode(temp);
		if(length == 1) return node;
		for(int i = startin;i<length;i++) {
			if(inorder[i]==temp) {
				node.left = build(preorder,inorder,startpre+1,startin,i-startin);
				node.right = build(preorder,inorder,startpre+i-startin,i,length-i+startin);
				return node;
			}
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
