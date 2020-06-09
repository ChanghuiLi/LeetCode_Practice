package 链表;

public class 合并两个有序链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode Combine(ListNode head1,ListNode head2) {
		if(head1==null) return head2;
		if(head2 == null) return head1;
		ListNode start = null;
		if(head1.val < head2.val) {
			start = head1;
			head1 = head1.next;
		}else {
			start = head2;
			head2 = head2.next;
		}
		ListNode s = start;
		while(head1!=null&&head2!=null) {
			if(head1.val < head2.val) {
				s.next = head1;
				head1 = head1.next;
				s = s.next;
			}else {
				s.next = head2;
				head2 = head2.next;
				s = s.next;
			}
		}
		if(head1 != null) {
			s.next = head1;
		}else {
			s.next = head2;
		}
		return start;
		
	}

}
