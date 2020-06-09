package 链表;

public class 链表环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean Circle(Node head) {
		if(head == null||head.next == null) return false;
		boolean res = false;
		Node slow = head;
		Node fast = head.next;
		while(slow!=fast&&fast!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
			
		}
		return false;
		
		
	}

}
	
