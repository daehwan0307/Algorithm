import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println(gcd(a,b));
		System.out.println(a*b/gcd(a,b));
	}
	
	public static int gcd(int a, int b) {
		
		while(b!=0) {
			int r= a%b;
			a=b;
			b=r; 
		}
		
		return a;
	}
}