import java.util.Scanner;

public class Mainkeep2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int temp = in.nextInt();
		int typecount = 0;
		boolean isOK = true;
		boolean[] have = new boolean[3];
		String line3 = in.nextLine();
        while(temp>0) {
            
            String line = in.nextLine();
            if(line.length()<=100&&line.length()>=8) {
            	if(line.charAt(0)>='0'&&line.charAt(0)<='9') {
            		System.out.println("NO");
            	}else {
            		int i = 0;
            		for(;i<line.length()&&isOK==true;i++) {
            			if((line.charAt(0)>='0'&&line.charAt(0)<='9')||(line.charAt(i)>='a'
            					&&line.charAt(i)<='z')||line.charAt(i)>='A'&&line.charAt(i)<='Z') {
            				if(have[0]==false&&line.charAt(0)>='0'&&line.charAt(0)<='9') {
            					have[0] = true;
            				}
            				if(have[1] == false&&line.charAt(i)>='a'&&line.charAt(i)<='z') {
            					have[1] = true;
            				}
            				if(have[2] == false&&line.charAt(i)>='A'&&line.charAt(i)<='Z') {
            					have[2] = true;
            				}
            				
            			}else {
            				System.out.println("NO");
            			}
            		}
            		if(i==line.length()) {
            			int count = 0;
            			for(int k = 0;k<have.length;k++) {
            				if(have[k]==true) {
            					count++;
            				}
            			}
            			if(count>=2) {
            				System.out.println("YES");
            			}else {
            				System.out.println("NO");
            			}
            		}else {
            			System.out.println("NO");
            		}
            	}
            }else {
            	System.out.println("NO");
            }
            
            
            temp--;
        }
	}

}
