import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] card = new int[20];
		for(int i = 0;i<card.length;i++) {
			card[i]=i+1;
		}

		
		for(int i = 0;i<10;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			for(int j = 0;j<(b-a+1)/2;j++) {
				int temp=0;
				temp=card[a+j];
				card[a+j]=card[b-j];
				card[b-j]=temp;
				
				
			}
		}
		for(int i =0;i<card.length;i++) {
			System.out.printf("%d ",card[i]);
		}
}
		
}