package DP;

import java.util.List;

public class P120miniTragle {
	public int minimumTotal2(List<List<Integer>> t) {
		if(t.size()<=0||t==null) return 0;
		//
		//行遍历t（倒数第二行开始）
		int sum = 0;
		for(int i = t.size()-2; i >=0; i--) {
			
			for(int j = 0; j < t.get(i).size(); j++) {
				sum = Math.min(t.get(i+1).get(j), t.get(i+1).get(j+1))+t.get(i).get(j);
				t.get(i).set(j, sum);
			}
		}
		//列遍历t
		//更新元素值。
		return t.get(0).get(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
