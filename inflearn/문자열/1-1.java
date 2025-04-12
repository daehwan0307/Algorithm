import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int answer = 0;
        String input1 = in.next().toUpperCase();
        String input2 = in.next().toUpperCase();
        for(int i=0; i<input1.length();i++){
            if(input1.charAt(i)==input2.charAt(0)){
                answer += 1;
            }

        }
        System.out.println(answer);
    }
}