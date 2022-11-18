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
		Main s = new Main();
		int c = s.fac(a);
		int d = s.fac(b);
		int e = s.fac(a-b);
		System.out.print(c/d/e);
	}
	
	public int fac(int num) {
		
		int result=1;
		for(int i = 1; i<=num;i++) {
			result=result*i;
		}
		
		return result;
		
	}
}