import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] tong = new int[5];
		
		for(int i = 0;i<tong.length;i++) {
			tong[i]=sc.nextInt();
		}

		for(int i = 0; i<tong.length;i++) {
			for (int j = 0;j<tong.length-1;j++) {
				if(tong[j]>tong[j+1]) {
					int temp = tong[j+1];
					tong[j+1]=tong[j];
					tong[j]=temp;
					for (int num : tong) {
                        System.out.print(num+" ");
                    }
					  System.out.println();
				}
	
				}	


			}

		}
}
		
