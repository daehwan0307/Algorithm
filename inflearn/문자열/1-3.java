import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        String[] strarr = str.split(" ");
        int small = 0;
        for (int i=0; i< strarr.length; i++){
            if(strarr[small].length()< strarr[i].length()){
                small = i;
            }
        }
        System.out.println(strarr[small]);
    }
}