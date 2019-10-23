package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextLine()) {
			String s1 = in.nextLine();
			String[] array1 = s1.split(" ");
			boolean res = false;
			for(int i = 1;i<array1.length-1;i++) {
				res = linked(array1[i-1],array1[i],array1[i+1]);
			}
			boolean res2 = linked(array1[1],array1[0],array1[array1.length-1]);
			System.out.print(res&&res2);
		}

	}

	private static boolean linked(String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0;i<s1.length();i++) {
			for(int j = 0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					if(map.containsKey(s1.charAt(i))) {
						map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
					}else {
						map.put(s1.charAt(i), 1);
					}
					
				}
			}
		}
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		boolean temp1 = true;
		for(int i = 0;i<s3.length();i++) {
			for(int j = 0;j<s2.length();j++) {
				if(s3.charAt(i)==s2.charAt(j)) {
					if(map2.containsKey(s3.charAt(i))&&map.containsKey(s3.charAt(i))) {
						if(temp1) {
							map.put(s3.charAt(i), map.get(s3.charAt(i))-1);
							temp1=false;
						}
						map2.put(s3.charAt(i), map2.get(s3.charAt(i))+1);
					}else {
						map2.put(s3.charAt(i), 1);
					}
					
				}
			}
		}
		if(!map.isEmpty()&&!map.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}

}
