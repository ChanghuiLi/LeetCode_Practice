package LeetCode;

public class 复制链表 {
	class Node {
	    public int val;
	    public Node next;
	    public Node random;

	    public Node() {}

	    public Node(int _val,Node _next,Node _random) {
	        val = _val;
	        next = _next;
	        random = _random;
	    }
	};
	//遍历两遍第一遍复制next，第二遍复制random
	public Node copyRandomList(Node head) {
		//原地复制
		Node cur = head;
		while(cur!=null) {
			Node node = new Node(cur.val,null,null);
			node.next = cur.next;
			cur.next = node;
			cur = node.next;
		}
		cur = head;
		while(cur!=null) {
			cur.next.random = cur.random;
			cur = cur.next.next;
		}
		Node res = head.next;
		cur = res;
		Node pcur = head;
		while(cur!=null) {
			pcur.next = pcur.next.next;
			if(cur.next!=null) {
				cur.next = cur.next.next;
			}
			cur = cur.next;
			pcur = pcur.next;
		}
		return res;
		
		
		//调整连接
		
		//拆分
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
