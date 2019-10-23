package 百度;

public class 链表反转 {
	public ListNode reverseList(ListNode head) {
		if(head==null) return null;
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode temp = head.next;
        ListNode temppre = head.next;
        while(head.next!=null) {
        	temp = head.next;
        	temppre = prehead.next;
        	prehead.next = temp;
        	head.next = temp.next;
        	temp.next = temppre;
        }
		return prehead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
