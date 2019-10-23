package 百度;

public class 编辑距离 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "din";
		String word2 = "distance";
		int path = Distance(word1,word2);
		System.out.println(path);
		
	}

	private static int Distance(String word1, String word2) {
		// TODO Auto-generated method stub
		//状态定义为：二维矩阵中子串到子串的编辑距离。
		//初始化存储的矩阵
        int[][] res = new int[word1.length()+1][word2.length()+1];
        for(int i = 1;i<=word2.length();i++) {
        	res[0][i] = i;
        }
        for(int i = 1;i<=word1.length();i++) {
        	res[i][0] = i;
        }
        for(int m = 1;m<=word1.length();m++) {
        	for(int n = 1;n<=word2.length();n++) {
        		//状态转移。
        		if(word1.charAt(m-1)==word2.charAt(n-1)) {
        			res[m][n] = res[m-1][n-1];
        		}else {
        			res[m][n] = Math.min(res[m-1][n-1], Math.min(res[m-1][n], res[m][n-1]))+1;
        		}
        	}
        }
        
        return res[word1.length()][word2.length()];
	}

}
