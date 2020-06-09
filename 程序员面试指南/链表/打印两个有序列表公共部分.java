package 链表;
public class 打印两个有序列表公共部分 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void printCommonPart(ListNode head1,ListNode head2) {
		System.out.println("Common Part: ");
		while(head1!=null&&head2!=null) {
			if(head1.val==head2.val) {
				System.out.print(head1.val);
				head1 = head1.next;
				head2 = head2.next;
			}else if(head1.val>head2.val) {
				head2 = head2.next;
			}else {
				head1 = head1.next;
			}
		}
		System.out.println();
	}

}
