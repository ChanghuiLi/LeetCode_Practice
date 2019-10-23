package 错题;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class 合并区间 {
	public int[][] merge(int[][] intervals) {
		if(intervals==null||intervals.length<=1) return intervals;
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		
		
		Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0],i2[0]));
		ArrayList<int[]> res = new ArrayList<>();
		int[] temp = intervals[0];
		res.add(temp);
		for(int[] interval:intervals) {
			if(temp[1]>=interval[0]) {
				temp[1] = Math.max(interval[1], temp[1]);
			}else {
				res.add(interval);
				temp = interval;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
