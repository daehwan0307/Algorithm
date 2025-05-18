import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] pivo = new int[N];

        pivo[0] = 1;
        pivo[1] = 1;

        for (int i = 2; i < N; i++) {
            pivo[i]= pivo[i-2]+pivo[i-1];
        }
        for(int i=0;i<N;i++)
            System.out.print(pivo[i]+" ");

    }
}
