
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		int e = c-a;
		int f = d-b;
		int[] arr = new int[4];
		arr[0]=a;
		arr[1]=b;
		arr[2]=e;
		arr[3]=f;
		Arrays.sort(arr);
		
		System.out.print(arr[0]);
				
	}

}