
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
public class Solution {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc. nextInt();

            if((a+b)==4)
            {
                if(a>b){
                    System.out.println("B");
                }else System.out.println("A");
            }
            else {
                if(a>b){
                    System.out.println("A");
                    
                }else System.out.println(("B"));
            }
                



    }
}