package LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class 高频的K个元素 {
	public List<Integer> topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i : nums) {
    	   map.put(i, map.getOrDefault(i, 0)+1);
       }
       PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
    	   public int compare(Integer a, Integer b)
           {
               return map.get(a) - map.get(b);
           }
       });
       for(int j : map.keySet()) {
    	   if(maxHeap.size()<k) {
    		   maxHeap.add(j);
    	   }else if(map.get(j)>maxHeap.peek()) {
    		   maxHeap.remove();
    		   maxHeap.add(j);
    	   }
       }
       List<Integer> res = new ArrayList<Integer>();
       while(!maxHeap.isEmpty()) {
    	   res.add(maxHeap.remove());
       }
       return res;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
