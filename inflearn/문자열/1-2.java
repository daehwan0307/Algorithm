import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char[] carray = input1.toCharArray();
        for(int i =0 ;i<carray.length;i++){
            if(Character.isUpperCase(input1.charAt(i))){
                carray[i]= Character.toLowerCase(input1.charAt(i));
            }else{
                carray[i]=Character.toUpperCase(input1.charAt(i));
            }
        }
        System.out.println(carray);
    }
}