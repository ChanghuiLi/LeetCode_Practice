package 字节跳动;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 字符2分割 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split("2");
		ArrayList<Integer> res = new ArrayList<Integer>();
		int [] nums=new int[str.length];
    	for(int i=0; i<nums.length; i++){
    		if(str[i]!=null&&str[i].length()>0) {
    			res.add(Integer.parseInt(str[i]));
//    			System.out.print(Integer.parseInt(str[i])+" ");
    		}
        }
    	Collections.sort(res);
    	for(int i:res) {
    		System.out.print(i+" ");
    	}
		

	}

}
