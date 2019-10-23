package Tree;

import java.util.ArrayList;

import Tree.Treemidpreconstruct.TreeNode;
//路径和为固定值的元素
public class presearchTree {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		findpath(res,new ArrayList<Integer>(),root,target);
		return res;
		
	}

	private void findpath(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path, TreeNode root, int target) {
		// TODO Auto-generated method stub
		path.add(root.val);
		if(root.left==null&&root.right==null) {
			if(root.val==target){
				res.add(path);
			}
			return;
		}
		ArrayList<Integer> path2 = new ArrayList<Integer>();
		path2.addAll(path);
		if(root.left!=null) {
			findpath(res,path,root.left,target-root.val);
		}
		if(root.right!=null) {
			findpath(res,path2,root.right,target-root.val);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
