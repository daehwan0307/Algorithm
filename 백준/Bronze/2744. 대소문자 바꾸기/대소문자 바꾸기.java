import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 	
    	String str = sc.next();

    	
    	for(int i = 0;i<str.length();i++) {
    		char c = str.charAt(i);
    		if(Character.isUpperCase(c)) {
    			System.out.print(String.valueOf(c).toLowerCase());
    		}else
    			System.out.print(String.valueOf(c).toUpperCase());
    				
    	}
    }
}