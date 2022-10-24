import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String tmp = String.valueOf(i);
            if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
                for (int j = 0; j < tmp.length(); j++) {
                    if (tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
 
             
        }
 
    }
}