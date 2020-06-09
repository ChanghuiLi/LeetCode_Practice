package 链表;

public class 删除链表K个位置 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Delete(ListNode head,int k) {
		ListNode last = head;
		ListNode pre = null;
		pre.next = head;
		while(k>0&&last!=null) {
			last = last.next;
		}
		if(k < 0) {
			System.out.println("error");
		}
		
		while(last!=null) {
			pre = pre.next;
			last = last.next;
		}
		pre.next = last.next;
	}
	
	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode pre = head,last = head;
		while(k>0) {
			last = last.next;
			k--;
		}
		while(last!=null) {
			last = last.next;
			pre = pre.next;
		}
		return pre;
    }

}
