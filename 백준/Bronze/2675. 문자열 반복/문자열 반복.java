import java.util.Scanner;

public class Main
{
     public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 	
    	int t = sc.nextInt();
    	
    	for(int tc =0; tc<t;tc++) {
    		int num = sc.nextInt();
    		String str = sc.next();
    		String[] strArr = str.split("");
    		
    		for(int i = 0;i<str.length();i++) {
    			for(int j = 0;j<num;j++) {
    				System.out.print(strArr[i]);
    			}
    			
    		}
    		System.out.println();
    		
    		
    	}
    }

}