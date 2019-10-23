import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 字节跳动 {
	static List<String> res = new ArrayList<String>();
	int len = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String temp = "";
        build(temp,input);
        Collections.sort(res);
        for(String output:res) {
        	System.out.println(output);
        }
	}
	
	private static void build(String temp, String input) {
		// TODO Auto-generated method stub
		if(input.length()==0) {
			res.add(temp);
			return;
		}
		
		if(input.length()==1||Integer.parseInt(input.substring(0, 2))>26||(input.length()>=3&&(Integer.parseInt(input.substring(2, 3))==0))) {
			temp = temp+(char)(Integer.parseInt(input.substring(0, 1))+'A'-1);
			input = input.substring(1, input.length());
			build(temp,input);
		}else {
			if(Integer.parseInt(input.substring(1, 2))==0) {
				temp = temp+(char)(Integer.parseInt(input.substring(0, 2))+'A'-1);
				input = input.substring(2, input.length());
				build(temp,input);
			}else {
				//一个数字的情况
				build(temp+(char)(Integer.parseInt(input.substring(0, 1))+'A'-1),input.substring(1, input.length()));
				//两个数字的情况
				build(temp+(char)(Integer.parseInt(input.substring(0, 2))+'A'-1),input.substring(2, input.length()));
			}
		}
		
	}

}
