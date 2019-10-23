package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.Treemidpreconstruct.TreeNode;

public class connect {
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}

	    public Node(int _val,Node _left,Node _right,Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
	//设定一个优先队列存储节点。
	//q.offer比add好的地方在于null的话就不插入。
	@SuppressWarnings("null")
	
	public Node connect(Node root) {
		if(root == null || root.left == null){//一定要看清题目再作答，注意边界条件。
            return root;
        }
		Queue<Node> q1 = new LinkedList<>();
		q1.offer(root.left);
        q1.offer(root.right);
		//处理q中元素
		while(!q1.isEmpty()) {
			int count = q1.size();
			Node temp1 = null;//记录上一个元素
			Node temp2 = null;//记录当前元素；
			while(count > 0) {
				temp2 = q1.poll();
				if(temp2.left != null && temp2.right !=null) {
					q1.offer(temp2.left);
					q1.offer(temp2.right);
				}
				if(temp1!=null) {
					temp1.next = temp2;
				}
                temp1 = temp2;
				count--;
                
			}
			
		}
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
