import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Mainpingan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ai =new int[n];
		for(int i = 0;i<n;i++) {
			ai[i] = sc.nextInt();
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(n);
		for(int num:ai) {
			maxHeap.add(num);
			minHeap.add(num);
		}
		int res = 0;
		int aMax = maxHeap.poll();
		int aMin = minHeap.poll();
		while(aMax>aMin) {
			maxHeap.add(aMax-2);
			minHeap.add(aMin+2);
			aMax = maxHeap.poll();
			aMin = minHeap.poll();
			res++;
		}
		if(aMax==aMin) {
			System.out.println(res);
		}else {
			System.out.println(-1);
		}
	}

}
