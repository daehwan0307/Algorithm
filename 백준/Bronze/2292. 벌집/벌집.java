import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
 
		int num = in.nextInt();	
		int line = 1;
		for(int i= 0;i<2000000000;i++) {
			line=line+6*i;
			if(line>=num) {
				System.out.println(i+1);
				break;
			}
		}
		
	}
}