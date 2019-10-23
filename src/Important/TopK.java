package Important;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TopK {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
		if(input.length <=k) throw new NumberFormatException();
		ArrayList<Integer> res = new ArrayList<Integer>();
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(input.length-1);
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //小顶堆，默认容量为11
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(input.length-1,new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		for(int i = 0;i<input.length;i++) {
			heap.offer(input[i]);
		}
		for(int j = k; j>0;j--) {
			res.add(heap.remove());
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Helloword");
	}

}
