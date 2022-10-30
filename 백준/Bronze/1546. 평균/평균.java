import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] numlist = new int[T];
        int sum =0;
        double avg = 0.0;
        for (int i = 0; i < T; i++) {
                numlist[i]=sc.nextInt();
        }

        Arrays.sort(numlist);
        int max = numlist[T-1];
        for (int i = 0; i < numlist.length; i++) {
            sum += numlist[i];
        }
    
        avg =100.0*sum/max/T;
        System.out.print(avg);


    }
}
