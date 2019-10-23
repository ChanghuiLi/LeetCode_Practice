package 剑指Offer;

public class 重构二叉树 {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //边界条件判定，输入是否正常；
		
		int prestart = 0;
		int instart = 0;
		int preend = pre.length-1;
		int inend = in.length-1;
		return helper(pre,in,prestart,preend,instart,inend);
		
		
		
    }

	private TreeNode helper(int[] pre, int[] in, int prestart, int preend, int instart, int inend) {
		// TODO Auto-generated method stub
		if(prestart>preend && instart>inend) return null;
		TreeNode root = new TreeNode(pre[prestart]);
		root.left=null;
		root.right=null;
		for(int i = instart;i<=inend;i++) {
			//相等的话
			//进行构建
			if(in[i] == pre[prestart]) {
				root.left = helper(pre,in,prestart+1,preend,instart,i-1);
				root.right = helper(pre,in,prestart=1,preend,i+1,inend);
			}
		}
		return root;
	}

}
