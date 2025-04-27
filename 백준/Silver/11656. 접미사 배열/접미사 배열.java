import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] wordlist = new String[word.length()];
        for(int i= 0; i<word.length();i++){
            wordlist[i]= word.substring(i,word.length());
        }
        Arrays.sort(wordlist);
        for(int i=0;i< wordlist.length;i++){
            System.out.println(wordlist[i]);
        }

    }
}