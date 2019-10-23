package huawei;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//等待接收nextline。
        String s = " ";
        while(input.hasNextLine()){//存在nextline
            s=input.nextLine();
            System.out.println(temset(s));
        }    
    }
    public static int temset(String s){
    int k = 1;
    for(int i = s.length()-1;i>=0;i--,k++){
        if(s.charAt(i)==' '){
            return k;
        }
    }
    return k;
}
}

