import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 게임 횟수

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
            } else if ((A[i] == 1 && B[i] == 3) ||
                    (A[i] == 2 && B[i] == 1) ||
                    (A[i] == 3 && B[i] == 2)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}