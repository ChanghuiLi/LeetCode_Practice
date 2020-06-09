package 百度Feed流;

public class 大数相加 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "123";
		String num2 = "234";
		Add(num1,num2);
	}
	
	public static void Add(String num1,String num2) {
		StringBuffer res = new StringBuffer(num1.length()+num2.length());
		num1 = new StringBuffer(num1).reverse().toString();
		num2 = new StringBuffer(num2).reverse().toString();
		int len = Math.min(num1.length(), num2.length());
		int cur = 0;
		int carry = 0;
		for(int i = 0;i<len;i++) {
			cur = num1.charAt(i)+num2.charAt(i)-2*'0'+carry;
			carry = cur/10;
			cur = cur%10;
			res.append(cur);
		}
		
		System.out.println(num1);
		
	}
}
