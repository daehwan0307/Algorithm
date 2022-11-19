import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int[][] arr = new int[size][2];
    	
    	for(int i = 0; i<size;i++) {
    		arr[i][0] = sc.nextInt();
    		arr[i][1] = sc.nextInt();
    	}
    	
    	Arrays.sort(arr,new Comparator<int[]>() {
    		@Override
    		public int compare(int[] e1, int[] e2) {
    			
    			if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
    				return e1[1] - e2[1];
    			}
    			else {
    				return e1[0] - e2[0];
    			}
    		}
		});
    	for(int i = 0; i < size; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
    }

}