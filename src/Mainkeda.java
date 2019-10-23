
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Mainkeda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       List<Character> res1 = new ArrayList<Character>();
        //StringBuffer res = new StringBuffer();
        for(int i = 0;i<str.length();i++) {
        	if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
        		//res.append(str.charAt(i));
        		res1.add(str.charAt(i));
        	}
        }
        Collections.sort(res1);
        if(res1.size()==0) {
        	System.out.println(-1);
        }else {
        	 System.out.println(res1);
        	 for(int i = 0;i<res1.size();i++) {
        		 System.out.print(res1.get(i));
        	 }
        	 System.out.println();
        }
       
     }
}
