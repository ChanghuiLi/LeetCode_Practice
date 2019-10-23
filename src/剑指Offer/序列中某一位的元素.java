package 剑指Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 序列中某一位的元素 {
	public static String PrintMinNumber(int [] numbers) {
        StringBuilder sb=new StringBuilder("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int len=numbers.length;
        for(int i = 0;i < len;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list,new Comparator<Integer>(){
        	public int compare(Integer str1,Integer str2) {
        		String s1 = ""+str1+str2;
        		String s2 = ""+str1+str2;
        		return s1.compareTo(s2);
        	}
        });
        
        /*
        Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer str1,Integer str2){
                String s1 = ""+str1+str2;
                String s2 = ""+str2+str1;
                return s1.compareTo(s2);
            }
        });*/
        for(int j:list){
            sb.append(j);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,2,1222,11};
		System.out.println(PrintMinNumber(a));
	}

}
