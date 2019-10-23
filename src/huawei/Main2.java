package huawei;
import java.util.Scanner;
public class Main2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = "";
        char c1 = ' ';
        int res = 0;
        while(input.hasNextLine()){
            s1 = input.nextLine();
            c1 = input.nextLine().toUpperCase().charAt(0);
            res = 0;
            for(int i = 0;i<s1.length();i++){
                if(s1.charAt(i)==c1){
                    res++;
                }
            }
            
        }
        System.out.println(res);
    }
}
