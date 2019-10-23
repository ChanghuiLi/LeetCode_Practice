import java.util.Scanner;

public class Mainyfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in = sc.nextLine();
		if(in.charAt(0)>='A'&&in.charAt(0)<='Z') {
			int i = 1;
			if(in.charAt(1)>='a'&&in.charAt(1)<='z') {
				for(;i<in.length()&&in.charAt(i)>='a'&&in.charAt(i)<='z';i++) {
					
				}
				if(i==in.length()) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}else if(in.charAt(1)>='A'&&in.charAt(1)<='Z'){
				for(;i<in.length()&&in.charAt(i)>='A'&&in.charAt(i)<='Z';i++) {
					
				}
				if(i==in.length()) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
			}
		}else {
			int i = 1;
			for(;i<in.length()&&in.charAt(i)>='a'&&in.charAt(i)<='z';i++) {
				
			}
			if(i==in.length()) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}

	}

}
