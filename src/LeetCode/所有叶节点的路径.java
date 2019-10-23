package LeetCode;

import java.util.ArrayList;

public class 所有叶节点的路径 {
	public ArrayList<Integer> FindPath(TreeNode root) {
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        search(res,sum,root);
    }

	private void search(ArrayList<Integer> res, int sum, TreeNode root) {
		// TODO Auto-generated method stub
		if(root!=null) {
			sum = sum+root.val;
			if(root.left==null&&root.right==null) {
				res.add(sum);
			}
			search(res,sum,root.left);
			search(res,sum,root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
