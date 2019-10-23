package LeetCode;

public class 奇偶链表 {
	public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd = head,even = head.next,preeven = even;
        while(even!=null&&even.next!=null) {
        	odd.next = even.next;
        	odd = odd.next;
        	even.next = odd.next;
        	even = even.next;
        	
        }
        odd.next = preeven;
        return head;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
