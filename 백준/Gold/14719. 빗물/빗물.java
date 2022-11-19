import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] height = new int[w];
        for(int i = 0; i < w; i++) {
            height[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 1; i < w - 1; i++) { 
            int left = 0;
            int right = 0;
            for(int j = 0; j < i; j++) {
                left = Math.max(height[j], left);
            }
            for(int j = i + 1; j < w; j++) {
                right = Math.max(height[j], right);
            }
            if(height[i] < left && height[i] < right) result += Math.min(left, right) - height[i];
        }
        System.out.println(result);
    }
}