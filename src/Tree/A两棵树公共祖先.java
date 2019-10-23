package Tree;

public class A两棵树公共祖先 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val=x;
		}
	}
	//二叉搜索树
	public TreeNode findfather(TreeNode root,TreeNode node1,TreeNode node2) {
		TreeNode s = root;
		int max = Math.max(node1.val, node2.val);
		int min = Math.min(node1.val, node2.val);
		while((s.val>max&&s.val>min)||(s.val<min&&s.val<max)) {
			if(s.val<max&&s.val<min) {
				s = s.right;
			}
			if(s.val>min&&s.val>max) {
				s = s.left;
			}
		}
		if(s.val<max&&s.val>min) {
			return s;
		}else {
			return null;
		}
	}
	
	//一般的情况
	private TreeNode ans;
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		this.recurseTree(root,p,q);
		return this.ans;
        
    }
	private boolean recurseTree(TreeNode troot, TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		if(troot == null) {
			return false;
		}
		int left = this.recurseTree(troot.left,p,q)?1:0;
		int right = this.recurseTree(troot.right,p,q)?0:1;
		int mid = (troot==p||troot==q)?0:1;
		if(left+right+mid>=2) {
			this.ans = troot;
		}
		return left+right+mid>0;
		
	}
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		//递归终止条件
		if(root==null) {
			return root;
		}
		if(root==p||root==q) {
			return root;
		}
		//访问左右节点
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);
		
		if(left!=null&&right!=null) {
			return root;
		}else if(left!=null) {
			return root.left;
		}else if(right!=null){
			return root.right;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
