import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 字符串拼接最大 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            String[] str = line.split(",");
            
            String temp = "";
            for(int i = 0;i<str.length;i++) {
            	for(int j = i+1;j<str.length;j++) {
            		if((str[i]+str[j]).compareTo(str[j]+str[i])<0) {
            			temp = str[i];
            			str[i] = str[j];
            			str[j] = temp;
            		}
            	}
            }
            if(str[0].equals("0")) {
            	System.out.println("0"); 
            }else {
            	System.out.println(Arrays.toString(str)); 
            }
            String res = "";
            for(String a:str) {
            	res+=a;
            }
            System.out.println(res); 
            
        }
	}

}
