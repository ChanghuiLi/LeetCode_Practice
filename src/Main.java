import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double input = sc.nextDouble();
		int[] price = new int[10001];
		
		for(int i = 1;i<=10000;i++) {
			if((input*i)==(int)(input*i)) {
				price[i] = (int) (input*i);
			}else if((input*i)-(int)(input*i)>((int)(input*i+1)-(input*i))){
				price[i] = (int)(input*i)+1;
			}else {
				price[i] = (int) (input*i);
			}
			
		}
		
		double[] min = new double[10001];
		for(int j = 1;j<=10000;j++) {
			min[j] = Math.abs(((double)price[j]/(double)j)-input);
		}
		
		int tag = 0;
		double res = 10000;
		for(int m = 1;m<=10000;m++) {
			if(min[m]<res) {
				res = min[m];
				tag = m;
			}
		}
		System.out.print(price[tag]+" ");
		System.out.print(tag);
	}

}
