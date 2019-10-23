package 剑指Offer;

public class 第一个只出现一次的字符 {
	public static int find(String str) {
		int[] s1 = new int[256];
		int[] s2 = new int[256];
		for(int i = 0;i<str.length();i++) {
			Character temp = str.charAt(i);
			if(s1[temp]==0&&s2[temp]==0) {
				s1[temp] = 1;
			}else if(s1[temp]==1&&s2[temp]==0) {
				s2[temp] = 1;
			}
		}
		for(int i = 0;i<256;i++) {
			if(s1[i]==1&&s2[i]==1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "asdasdasd";
		System.out.println((char)(find(s1)));
	}

}
