package huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Scanner;
public class Main12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	        int[] a = {1,2,3,4};
	        a.length
	        while(input.hasNextLine()){
	            String s1 = input.nextLine();
	            if(s1.length()<8){
	                while(s1.length()<8){
	                    s1+='0';
	                }
	                System.out.println(s1);
	            }else if(s1.length()>8){
	                int start = 0;
	                int end = 8;
	                while(end<=s1.length()){
	                    System.out.println(s1.substring(start,end));
	                    start = start + 8;
	                    end = start + 8;
	                }
	                if(start < s1.length()){
	                    String minset = s1.substring(start,s1.length());
	                    while(minset.length()<8){
	                    minset+='0';
	                }
	                System.out.println(minset);
	                }
	            }else{
	                System.out.println(s1);
	                
	            }
	            
	        }
    }
}