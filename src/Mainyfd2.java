import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mainyfd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		int[] in = new int[len];
		for(int i = 0;i<len;i++) {
			in[i] = sc.nextInt();
		}
		/*
		for(int i = 0;i<len;i++) {
			System.out.println(in[i]);
		}*/
		List<Integer> height = new ArrayList<Integer>();
		for(int i = 0;i<len;i++) {
			for(int j = i+1;j<len;j++) {
				if(in[i]<=in[j]) {
					height.add((j-i));
				}
			}
		}
		Collections.sort(height);
		if(height.size()>0) {
			System.out.println(height.get(height.size()-1));
		}else {
			
		}
		

	}

}
