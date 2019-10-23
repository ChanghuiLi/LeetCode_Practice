package 百度;

public class 大数据处理 {
	static class ListNode{
		String val;
		ListNode next;
		ListNode(String x){
			this.val = x;
			this.next = null;
		}
	}
	static class Hash{
		ListNode[] node = new ListNode[1000];
		public void set(String url) {
			
		}
		public String get(String url) {
			
			return null;
		}
		public Hash() {
			node = new ListNode[1000];
			for(int i = 0;i<1000;i++) {
				node[i] = null;
			}
		}
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash t = new Hash();
	}

}
