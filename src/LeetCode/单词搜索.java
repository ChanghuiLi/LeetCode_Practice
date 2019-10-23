package LeetCode;

public class 单词搜索 {
	
	//需要有一个标记数组来确定某元素是否被访问。
	public boolean exist(char[][] board, String word) {
		boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length;i++) {
        	for(int j = 0;j<board[0].length;j++) {
        		if(word.charAt(0)==board[i][j]&&search(i,j,0,word,visited,board)) {
        			return true;
        		}
        	}
        }
        return false;
    }

	private boolean search(int i, int j, int k, String word, boolean[][] visited, char[][] board) {
		// TODO Auto-generated method stub
		if(k==word.length()) return true;
		if(i>=board.length||i<0||j<0||j>=board[0].length||board[i][j]!=word.charAt(k)||visited[i][j]) {
			return false;
		}
		//上下左右移动，符合的话return true
		visited[i][j] = true;
		if(search(i,j+1,k+1,word,visited,board)||search(i+1,j,k+1,word,visited,board)||search(i,j-1,k+1,word,visited,board)||search(i-1,j,k+1,word,visited,board)) {
			return true;
		}
		visited[i][j] = false;//设置标记位
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
