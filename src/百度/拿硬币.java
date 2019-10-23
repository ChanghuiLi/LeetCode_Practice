package 百度;

public class 拿硬币 {
	public int takeCoins(int[] list, int k) {
        // Write your code here
		if(list.length==0||list==null) return 0;
		if(list.length<=k) {
			int temp = 0;
			for(int i = 0;i<list.length;i++) {
				temp = temp+list[i];
			}
			return temp;
		}
		int left = k-1;
		int right = list.length-1;
		int max = 0;
		int res = 0;
		for(int i = 0;i <=left;i++) {
			res = res+list[i];
		}
		max = res;
		for(int j = k-1;j>=0;j--) {
			res = res-list[left--]+list[right--];
			max = Math.max(res, max);
		}
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
