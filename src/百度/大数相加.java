package 百度;

public class 大数相加 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123459";
		String str2 = "123";
		System.out.println(add(str1, str2));//123582

	}

	private static String add(String str1, String str2) {
		// TODO Auto-generated method stub
		//特殊情况处理
		
		
		
		StringBuffer res = new StringBuffer(str1.length()+str2.length()+1);
		str1 = new StringBuffer(str1).reverse().toString();
		str2 = new StringBuffer(str2).reverse().toString();
		int currnum = 0;
		int carry = 0;
		int i = 0;
		int minlen = Math.min(str1.length(), str2.length());
		for(;i<minlen;i++) {
			currnum = str1.charAt(i)+str2.charAt(i) - 2*'0'+carry;
			carry = currnum/10;
			currnum%=10;
			res.append(String.valueOf(currnum));
		}
		return null;
	}

}
