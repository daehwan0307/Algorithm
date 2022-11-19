import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
 
public class Solution {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 입력 
		int T = sc.nextInt();
				
		//우,하,좌,상 
		int[] di = {0, 1, 0, -1};
		int[] dj = {1, 0, -1, 0};
		
		for(int i = 1; i <= T; i++) {
			int cnt = 1;
			int x = 0, y = 0, dir = 0;			
			//지도 크기 
			int size = sc.nextInt();
	
			int[][] map = new int[size][size];
			
			while(cnt <= (size*size)) {
				map[x][y] = cnt++;
				x+=di[dir];
				y+=dj[dir];
				
				//배열의 끝을 만나거나 이미 채워진 부분을 만났을 때 방향 전환 
				if(x < 0 || x > size-1 || y < 0 || y > size-1 || map[x][y] != 0) {
					//이전 자리로 다시 돌아가고, 
					x-= di[dir];
					y-= dj[dir];
					
					//방향 전환
					dir = (dir + 1)%4;
					
					//바뀐 방향으로 이동 
					x+=di[dir];
					y+=dj[dir];
				}
			}
			
			System.out.println("#"+i);
			for(int p = 0; p < size; p++) {
				for(int q = 0; q < size; q++) {
					System.out.print(map[p][q] + " ");
					
				}
				System.out.println();
				}				
			}								
		}	
		
}