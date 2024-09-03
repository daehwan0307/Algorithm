import java.io. *;

import java.util.*;
public class Main {

    public static void main(String[] args)  {

     Scanner sc = new Scanner(System.in);

     

     while(sc.hasNext()) {

     int n = sc.nextInt(); // 가지고 있는 쿠폰 n개

     int k = sc.nextInt(); // 도장 k개 모을시 => 쿠폰 1개

     int count = 0, temp= n;

     

     while(temp >= k) {

     count += temp / k;

     temp = temp/k + temp%k;

     }

     

     System.out.println(n + count);

     }

     sc.close();

     }

}
