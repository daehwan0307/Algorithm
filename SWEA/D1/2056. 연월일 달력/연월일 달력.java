/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
    {
        int[] dayNum = {31,28,31,30,31,30,31,31,30,31,30,31};  // 1월~12월까지 각 날짜 수

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String A = sc.next();  //연원일 순으로 구성된 8자리 날짜 입력

            String Year = A.substring(0, 4);  //년도 저장
            String Month = A.substring(4, 6); //달 저장
            String Day = A.substring(6, 8); //일 저장

            if (Integer.parseInt(Month) > 12 || Integer.parseInt(Month) <= 0) {
                System.out.printf("#%d -1\n",i);
            } else if (Integer.parseInt(Day) > dayNum[Integer.parseInt(Month) - 1] || Integer.parseInt(Day) <= 0) {
                System.out.printf("#%d -1\n",i);
            } else {
                System.out.printf("#%d %s/%s/%s\n",i, Year, Month, Day);
            }

        }

    }
}