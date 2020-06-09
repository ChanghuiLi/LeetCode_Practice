package 链表;

public class 反转链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode ReverseList(ListNode head) {
		while(head==null||head.next==null) return head;
		ListNode pre = head;
		ListNode n = null;
		while(pre.next!=null) {
			n = pre.next;
			pre.next = n.next;
			n.next = head;
			head = n;
		}
		return head;
	}

}
