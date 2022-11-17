import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 	
    		
    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	Main s = new Main();
    	s.cal(a,b);
    }
    
    public void cal(long a, long b) {
    	System.out.printf("%d",(a-b)*(a+b));
    }
}