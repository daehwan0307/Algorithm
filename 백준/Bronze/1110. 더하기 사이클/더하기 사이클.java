
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int initNum = sc.nextInt();
        int newNum = 0;
        int temp = initNum;
        int count = 0;
        while (true) {

            newNum = (temp%10)*10 + (temp/10+temp)%10 ;
            temp = newNum;
            count++;
            if(initNum==newNum){
                System.out.printf("%d",count);
                break;

            }
        }


    }
}
