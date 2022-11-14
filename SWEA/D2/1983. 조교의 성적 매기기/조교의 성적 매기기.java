import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Solution {
    public static void main(String args[]) {
        final String grades[] = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt()-1;
            Integer a[] = new Integer[n];
            for(int i=0; i<n; i++) {
                int mid = sc.nextInt(); 
                int fin = sc.nextInt();
                int hom = sc.nextInt();
                a[i] = mid*35 + fin*45 + hom*20;
            }
            int k_score = a[k];
            Arrays.sort(a, Collections.reverseOrder());
            int k_rank = Arrays.asList(a).indexOf(k_score);
            System.out.format("#%d %s\n", t, grades[10*k_rank/n]);
        }
    }
}