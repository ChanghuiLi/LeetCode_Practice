package 百度;

import java.util.HashSet;
import java.util.Set;

public class 链表环 {
	
	public boolean hasCycle(ListNode head) {
		if(head==null||head.next==null) return false;
        ListNode slow = head;
        ListNode quick = head.next;
        while(quick!=slow) {
        	if(quick ==null||quick==null) {
        		return false;
        	}
        	quick = quick.next.next;
        	slow = slow.next;
        }
        
        return true;
    }
	public ListNode detectCycle(ListNode head) {
		if(head==null||head.next==null) return null;
        ListNode slow = head;
        ListNode quick = head.next;
        while(quick!=slow) {
        	if(quick ==null||quick==null) {
        		return null;
        	}
        	quick = quick.next.next;
        	slow = slow.next;
        }
        if(quick==slow&&slow!=null) {
        	int count = 1;
        	quick = quick.next;
        	while(quick!=slow) {
        		quick = quick.next;
        		count++;
        	}
        	return findcyclenode(head,count);
        }else {
        	return null;
        }
    }

	private ListNode findcyclenode(ListNode head, int count) {
		// TODO Auto-generated method stub
		ListNode l1 = head;
		ListNode l2 = head;
		while(count>0) {
			l2 = l2.next;
		}
		while(l2!=l1) {
			l1 = l1.next;
			l2 = l2.next;
		}
		return l2;
	}
	public ListNode detectCycle2(ListNode head) {
		if(head == null||head.next==null) return null;
		Set<ListNode> res = new HashSet<ListNode>();
		res.add(head);
		head = head.next;
		while(head!=null) {
			if(res.contains(head)) {
				return head;
			}
			res.add(head);
			head = head.next;
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
