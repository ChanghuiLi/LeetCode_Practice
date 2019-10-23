import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class tenxun9205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Set<String> set = new HashSet<String>();
		List<String> res = new ArrayList<String>();
		for(int i = 0;i<n+1;i++) {
			set.add(in.nextLine());
		}
		
		for(int i = 0;i<m&&in.hasNext();i++) {
			String line = in.nextLine();
			System.out.println(line);
	        String[] str = line.split(" ");
//	        System.out.println(str.length);
//	        System.out.println(str[0]+"   "+str[1]);
	        System.out.println(Helper(set,str[0],str[1]));
		}
		
		

	}

	private static String Helper(Set<String> set, String s1, String s2) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<String>();
		if(set.contains(s1)) return s1;
		for(String temps:set) {
			if(temps.length()>=s1.length()&&temps.substring(0, s1.length()).equals(s1)) {
				if(temps.length()>=s2.length()&&(temps.substring(0, s2.length()).equals(s2)==false)) {
					res.add(temps);
				}
				if(temps.length()<s2.length()) {
					res.add(temps);
				}
				
			}
		}
		if(res.size()==0) {
			return "-1";
		}else {
			Collections.sort(res);
			return res.get(0);
		}
	}

}
