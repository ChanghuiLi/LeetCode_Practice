package LeetCode;

public class 合并有序链表 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode resfinal = res;
        while(l1!=null||l2!=null) {
        	//找到l1和l2最小的元素
        	ListNode temp = new ListNode(0);
        	if(l1.val<=l2.val) {
        		temp.val = l1.val;
        		l1 = l1.next;
        	}else {
        		temp.val = l2.val;
        		l2 = l2.next;
        	}
        	
        	//在新链表中添加元素
        	res.next = temp;
        	res = res.next;
        }
        if(l1==null) {
        	res.next = l2;
        }
        if(l2==null) {
        	res.next = l1;
        }
        return resfinal;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
