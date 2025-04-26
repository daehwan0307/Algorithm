import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char[] strarr = str.toCharArray();
        for(int i=0 ; i<strarr.length/2; i++){
            if(strarr[i] != strarr[strarr.length-i-1]){
                System.out.println("0");
                return ;
            }
        }
        System.out.println("1");
        }
}
