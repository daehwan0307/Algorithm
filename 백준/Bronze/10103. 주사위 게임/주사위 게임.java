import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 입력 
		int T = sc.nextInt();
		int cresult=100;
		int sresult=100;
		for(int i =0;i<T;i++) {
			int c= sc.nextInt();
			int s= sc.nextInt();
			
			if(c>s) {
				sresult-=c;
			}else if(c<s){
				cresult-=s;
			}else
				;
			
		}
		System.out.println(cresult);
		System.out.println(sresult);
}
		
}