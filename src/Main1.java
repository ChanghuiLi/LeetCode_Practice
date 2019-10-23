import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        //读取一行元素；
        while(sc.hasNext()){
            String s1=sc.nextLine();
            String s2 = sc.nextLine();
            int res = process(s1,s2);
            System.out.print(res);
        }
	}

	private static int process(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()==0||s1 == null||s2.length()==0||s2 == null)  return 0;
		if(s2.length()>s1.length()) {
			return 0;
		}
		String s = s1+s1;
		String s3 = s.substring(0, s1.length()+s2.length());
		int flag = 0;
		int len = s3.length();
		for(int i = 0;i<len;i++) {
			if(s2.equals(s.substring(i, i+s2.length()))){
				flag = 1;
				break;
			}
		}
		return flag;
	}

	

}
