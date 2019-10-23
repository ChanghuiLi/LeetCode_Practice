package LeetCode;
public class 删除链表倒数K个数 {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode temp = head;
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        while(n>0&&temp!=null) {
        	if(n==1) {
        		if(temp.next==null) {
        			return prehead.next.next;
        		}
        	}
        	temp = temp.next;
        	n--;
        }
        while(temp.next!=null) {
        	temp = temp.next;
        	head = head.next;
        }
        head.next = head.next.next;
        return prehead.next;
        
    }
}
