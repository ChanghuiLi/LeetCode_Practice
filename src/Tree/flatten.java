package Tree;

import Tree.Treemidpreconstruct.TreeNode;

public class flatten {
	TreeNode res = null;
	public void flatten(TreeNode root) {
        if(root!=null) {
        	if(res != null) {
        		res.left = root;
        		res.right = null;
        	}else {
        		res = root;
        	}
        }
        flatten(root.right);
        flatten(root.left);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
