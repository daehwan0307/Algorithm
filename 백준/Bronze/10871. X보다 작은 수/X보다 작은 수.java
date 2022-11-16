import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int size = sc.nextInt();
    	int a = sc.nextInt();
    	
    	int[] numArr = new int[size];
    	
    	for(int i =0;i<size;i++) {
    		numArr[i]=sc.nextInt();
    	}
    	for(int i =0;i<size;i++) {
    		if(numArr[i]<a) {
    			System.out.printf("%d ", numArr[i]);
    		}
    	}
    	
    }
}