import java.util.Scanner;

public class tenxun032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
        int n = in.nextInt();
        String target = in.nextLine();
        System.out.println(target);
        while(in.hasNextLine()||in.hasNextInt()) {
        	String a = in.nextLine();
        	String b = in.nextLine();
        	System.out.println(b);
        	int k = Integer.parseInt(b);
        	String[] strs = new String[k];
        	for(int i = 0;i<strs.length;i++) {
            	strs[i] = in.nextLine();
            }
        	int res = 0;
        	for(int i = 0;i<strs.length;i++) {
            	if(helper(strs[i],target)) {
            		res++;
            	}
            }
        	
        	
        }
	}

	private static boolean helper(String str, String target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = str.length();
		int finalend = 0;
		if(end<target.length()) {
			while(str.equals(target.substring(start,end))&&end<target.length()) {
				start = end;
				end = start+end;
			}
			if(end>target.length()) {
				
			}
		}
		
		
	}

}
