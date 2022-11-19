import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	String[][] strArr = new String[size][2];
    	
    	for(int i=0;i<size;i++) {
    		strArr[i][0]=sc.next();
    		strArr[i][1]=sc.next();
    	}
    	
    	Arrays.sort(strArr,new Comparator<String[]>(){
    		@Override
    		public int compare(String[] s1, String[] s2) {
    			return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
    		}
    	});
    	for(int i = 0; i < size; i++) {
			System.out.println(strArr[i][0] + " " + strArr[i][1]);
		}
    }

}