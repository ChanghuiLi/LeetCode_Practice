package 百度;
//大小两个指针
public class 蓄水池 {
	public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int res = 0;
        int temp = 0;
        while(i<j) {
        	temp = Math.min(height[i], height[j]);
        	res = Math.max(res, temp*(j-i));
        	if(height[i]<height[j]) i++;
        	else	j--;
        }
        return res;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
