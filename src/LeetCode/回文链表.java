package LeetCode;

public class 回文链表 {
	public boolean isPalindrome(ListNode head) {
		if(head == null ||head.next == null) return true;
		ListNode pre = null,prepre = null,fast = head,slow = head;
		while(fast!=null&&fast.next!=null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
			//反转前面的链表
			pre.next = prepre;
			prepre = pre;
		}
		ListNode p1 = pre;
		ListNode p2;
		if(fast==null) {
			p2 = slow;
			
		}else {
			p2 = slow.next;
		}
		while(p1!=null) {
			if(p1.val!=p2.val) {
				return false;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
