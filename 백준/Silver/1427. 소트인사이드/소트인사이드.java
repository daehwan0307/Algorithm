
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileInputStream;

class Main
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] strArr = num.split("");
		Arrays.sort(strArr,Comparator.reverseOrder());
	
		for(int i = 0;i<strArr.length;i++)
		System.out.print(strArr[i]);
				
	}
}