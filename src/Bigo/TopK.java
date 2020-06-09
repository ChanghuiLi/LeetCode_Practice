package Bigo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TopK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<Integer> TopK2(int [] input, int k){
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 int len = input.length;
		 if(k>len||k<=0) return res;
		 PriorityQueue<Integer> q = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
			 @Override
			 public int compare(Integer o1,Integer o2) {
				 return o2.compareTo(o1);
			 }
			 
		 });
		 for(int i =0;i<len;i++) {
			 q.add(input[i]);
		 }
		 for(int j = 0;j<k;j++) {
			 res.add(q.remove());
		 }
		 return res;
	 }

}
