package 极客时间;
//Leetcode208
public class Trie树实现大数据中查找单词 {
	//根节点不包含字符
	static final int child_size = 26;
	static class TreeNode{
		TreeNode[] child = new TreeNode[child_size];
		boolean isend = false;
		public TreeNode(){
			isend = false;
			for(int i = 0;i<child_size;i++) {
				child[i] = null;
			}
		}
		public TreeNode get(char ch) {
			return child[ch-'a'];
		}
		public boolean containkey(char ch) {
			return child[ch -'a'] != null;
		}
		public void put(char ch,TreeNode node) {
			child[ch-'a'] = node;
		}
		public void setend() {
			isend = true;
		}
		public boolean isEnd() {
			return isend;
		}
	}
	class Trie{
		public Trie() {
			root = new TreeNode();
		}
		TreeNode root = new TreeNode();
		public boolean search(String word) {
			TreeNode node = searchnode(word);
			return node!=null&&node.isend;
		}
		private TreeNode searchnode(String word) {
			// TODO Auto-generated method stub
			TreeNode node = root;
			for(int i = 0;i<word.length();i++) {
				char c = word.charAt(i);
				if(node.containkey(c)) {
					node = node.get(c);
				}else {
					return null;
				}
			}
			return node;
		}
		public void insert(String word) {
			TreeNode node = root;
			for(int i = 0;i<word.length();i++) {
				char ch = word.charAt(i);
				if(!root.containkey(ch)) {
					node.put(ch, root);
				}
				node = node.get(ch);
			}
			node.setend();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode res = new TreeNode();
	}

}
