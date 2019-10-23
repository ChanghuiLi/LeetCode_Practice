package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.A两棵树公共祖先.TreeNode;


public class 锯齿层次遍历 {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty()) {
        	res.add(new ArrayList<Integer>());
        	for(int i = 0;i<q.size();i++) {
        		//输出q中元素
        		TreeNode t = q.remove();
        		//输出元素入队，level%2==0正向。level%2==1反向；
        		if(level%2==0) {
        			res.get(level).add(t.val);
        		}else {
        			res.get(level).add(0,t.val);
        		}
        		if(t.left!=null) q.add(t.left);
    			if(t.right!=null) q.add(t.right);
        	}
        	level++;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
