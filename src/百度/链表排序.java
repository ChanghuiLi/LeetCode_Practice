package 百度;



public class 链表排序 {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			this.val=x;
			this.next=null;
		}
	}
	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		ListNode res = new ListNode(0);
		res.next=head;
		Sort(head,null);
		return res.next;
		
	}
	private void Sort(ListNode head, ListNode end) {
		// TODO Auto-generated method stub
		if(head==end||head.next==end) return;
		int tag = head.val;
		ListNode curr = head.next;
		ListNode pivot = head;
		int temp = 0;
		while(curr!=end) {
			if(curr.val<tag) {
				pivot = pivot.next;
				temp = curr.val;
				curr.val=pivot.val;
				pivot.val = temp;
			}
			curr = curr.next;
		}
		temp = pivot.val;
		pivot.val = head.val;
		head.val = temp;
		Sort(head,pivot);
		Sort(pivot.next,end);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
