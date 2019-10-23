import java.util.Scanner;

public class Keep3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sumy = 0;
		double sumx = 0;
		double chenx = 1;
		double cheny = 1;
		double sumapx = 1;
		int count = 0;
		double sumcxy = 0;
        while (in.hasNextLine()) {
            String a = in.nextLine();
            String[] str = a.split(" ");
            double [] num=new double[str.length];
        	for(int i=0; i<num.length; i++){
            	num[i]=Integer.parseInt(str[i]);
            }
        	double x = num[0];
        	double y = num[1];
            sumx = sumx + x;
            sumy = sumy + y;
            chenx = chenx * x;
            cheny = cheny * y;
            sumapx = sumapx+x*x;
            count = count+1;
            sumcxy = sumcxy+ x*y;
        }
        System.out.println("count = "+count);
        double a = (sumcxy-sumx*sumy/count)/(sumapx-count*sumx*sumx);
        double b = (sumy)/count - a*(sumx)/count;
        System.out.println(a+"	"+b);

	}

}
