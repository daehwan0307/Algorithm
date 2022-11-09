import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            int n = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            while( n%2 == 0 ) { n /= 2; a++; }
            while( n%3 == 0 ) { n /= 3; b++; }
            while( n%5 == 0 ) { n /= 5; c++; }
            while( n%7 == 0 ) { n /= 7; d++; }
            while( n%11 == 0 ) { n /= 11; e++; }
            System.out.format("#%d %d %d %d %d %d\n", tc, a, b, c, d, e);
        }
    }
}