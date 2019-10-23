package 百度;

public class 字符串移位 {
	public static String move(String s) {
		String s1 = "";
		String s2 = "";
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)=='#') {
				s1 = s1+"#";
			}else {
				s2 = s2+s.charAt(i);
			}
		}
		return s1+s2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ahd#ajs##akjshd";
		System.out.println(move(s));
	}

}
