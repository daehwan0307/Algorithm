import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt();   	
    	
    	for(int tc = 0;tc<T;tc++) {
    		String str = sc.next();
    		String[] strArr = str.split("");
    		System.out.println(strArr[0]+strArr[strArr.length-1]);
    	}

    }
}