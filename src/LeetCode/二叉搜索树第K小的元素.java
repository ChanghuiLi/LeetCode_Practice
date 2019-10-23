package LeetCode;

import java.util.Stack;

public class 二叉搜索树第K小的元素 {
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		int count = 0;
		while(root!=null||!s.isEmpty()) {
			while(root!=null) {
				s.push(root);
				root = root.left;
			}
			if(!s.isEmpty()) {
				TreeNode m = s.pop();
				count++;
				if(count==k) {
					return m.val;
				}
				root = m.right;
			}
		}
		return 0;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
