package 数组和矩阵问题;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 无序数组中最小最大K个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,345,546,123,34,34,67};
		Mini_Max_K(a,5);
		

	}
	public static void Mini_Max_K(int [] input, int k){
		ArrayList<Integer> min = new ArrayList<Integer>();
		ArrayList<Integer> max = new ArrayList<Integer>();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		PriorityQueue<Integer> mq = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
			@Override
			 public int compare(Integer o1,Integer o2) {
				 return o2-o1;
			 }
		});
		for(int i = 0; i < input.length; i++) {
			q.add(input[i]);
			mq.add(input[i]);
		}
		for(int j = 0; j<k; j++) {
			min.add(q.remove());
			max.add(mq.remove());
		}
		System.out.println("min = "+ min);
		System.out.println("max = "+ max);
		
	}

}
