package 面试前必看;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 全排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int M = in.nextInt();
	    int K = in.nextInt();
	    char[] input = new char[N+M];
	    for(int i = 0;i<N;i++) {
	    	input[i] = 'a';
	    }
	    for(int i = N;i<M+N;i++) {
	    	input[i] = 'b';
	    }
	    List<List<Character>> res = permute(input);
	    HashSet<String> s = new HashSet<String>();
		for(List<Character> a:res) {
			StringBuilder t1 = new StringBuilder();
			for(Character b:a) {
				t1.append(b);
			}
			String t2 = t1.toString();
			s.add(t2);
		}
		
		System.out.println(s.toString());

	}
	public static List<List<Character>> permute(char[] input) {
        if(input==null||input.length==0) return null;
        List<List<Character>> res = new ArrayList<List<Character>>();
        int start = 0;
        int end = input.length;
        List<Character> temp = new ArrayList<Character>();
        for(Character n:input) {
        	temp.add(n);
        }
        helper(res,temp,start,end);
        
        return res;
    }
	private static void helper(List<List<Character>> res, List<Character> temp, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end) {
			res.add(new ArrayList<Character>(temp));
		}
		//else {
			for(int i = start;i<end;i++) {
				Collections.swap(temp, start, i);
				helper(res,temp,start+1,end);
				Collections.swap(temp, start, i);
			}
			
		//}
	}

}
