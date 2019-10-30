package 字节跳动;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 最大的K个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++) {
        	nums[i] = sc.nextInt();
        }
        ArrayList<Integer> res = GetLeastNumbers_Solution2(nums,k);
//        System.out.println(res);
        for(int i:res) {
        	System.out.print(i+" ");
        }
        

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
		 for(int j = 0;j<k;j++) {
			 res.add(q.remove());
		 }
		 return res;
	 }

}
