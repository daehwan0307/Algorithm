import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int[] arr = new int[size];
		
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i = 0;i<size;i++) {
			if(check(arr[i])==true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean check(int a) {
		
		if(a==1) return false;
		
		for(int i=2;i<a;i++) {
			if(a%i==0)return false;
		}
		
		return true;

	}
}