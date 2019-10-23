import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mainpdd901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split(";");
            int count = Integer.parseInt(str[1]);
            String[] str2 = str[0].split(",");
            int [] num=new int[str2.length];
        	for(int i=0; i<num.length; i++){
            	num[i]=Integer.parseInt(str2[i]);
            }
        	/*
            for(int i = 0;i<num.length;i++) {
            	System.out.print(num[i]);
            }
            System.out.println(count);
            System.out.println(count);
            */
        	List<Integer> nums1 = new ArrayList<Integer>();
        	List<Integer> nums2 = new ArrayList<Integer>();
        	List<Integer> res = new ArrayList<Integer>();
        	for(int i = 0;i<num.length;i++) {
        		if(num[i]%2==0) {
        			nums2.add(num[i]);
        		}else {
        			nums1.add(num[i]);
        		}
        	}
        	Collections.sort(nums1);
        	Collections.reverse(nums1);
        	Collections.sort(nums2);
        	Collections.reverse(nums2);
        	for(int i = 0;i<count;i++) {
        		if(i<nums2.size()) {
        			res.add(nums2.get(i));
        		}else {
        			res.add(nums1.get(i-nums2.size()));
        		}
        	}
        	for(int i = 0;i<res.size();i++) {
        		if(i==res.size()-1) {
        			System.out.print(res.get(i));
        		}else {
        			System.out.print(res.get(i)+",");
        		}
        		
        	}
        }
	}

}
