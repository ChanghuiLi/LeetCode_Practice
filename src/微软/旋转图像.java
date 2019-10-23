package 微软;

public class 旋转图像 {
	public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length==0) return;
        int temp = 0;
        int Len = matrix.length;
        for(int i = 0;i < Len; i++) {
        	for(int j = i; j < Len; j++) {
        		temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        }
        
        for(int i = 0; i < Len; i++) {
        	for(int j = 0; j < Len/2;j++) {
        		temp = matrix[i][j];
        		matrix[i][j] = matrix[i][Len-j-1];
        		matrix[i][Len-j-1] = temp;
        	}
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
