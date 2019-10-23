package 剑指Offer;

public class 将数字翻译成字符串 {
	//状态定义：f（i）表示当前可以从第i位开始有多少种方法。
	//递归的思想来做f（i)= f（i+1)+g(i,i+1)*f(i+2)
	//自底向上动态规划
	
	public static int trans(String str1) {
		int f1 = 0,f2 = 1,g = 0;
		int temp = 0;
		for(int i = str1.length()-2;i>=0;i--) {
			if(Integer.parseInt(str1.charAt(i)+""+str1.charAt(i+1))<26) {
				g = 1;
			}else {
				g = 0;
			}
			temp = f2;
			f2 = f2 + g*f1;
			f1 = temp;
		}
		return f2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trans("12258"));
	}

}
