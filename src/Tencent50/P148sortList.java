package Tencent50;

public class P148sortList {
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	public ListNode sortList(ListNode head) {
        if(head ==null||head.next==null) return head;
        quicksort(head,null);
        
    }

	private void quicksort(ListNode head, ListNode pre) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}

}
