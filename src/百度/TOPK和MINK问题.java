package 百度;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TOPK和MINK问题 {
	 public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 int len = input.length;
		 if(k>len||k<=0) return res;
		 PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		 for(int i =0;i<len;i++) {
			 q.add(input[i]);
		 }
		 for(int j = k;j>0;j--) {
			 res.add(q.remove());
		 }
		 return res;
	 }
	 public static ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k){
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
			 q.offer(input[i]);
		 }
		 for(int j = 0;j<q.size();j++) {
			 res.add(q.remove());
		 }
		 return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,345,546,123,34,34,67};
		System.out.println(GetLeastNumbers_Solution(a,4));
		System.out.println(GetLeastNumbers_Solution2(a,4));

	}

}
