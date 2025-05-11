import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		HashSet<String> set=new HashSet<>();          
		String word=br.readLine();                    
		for(int i=0;i<=word.length()-1;i++) {
			for(int j=i+1;j<=word.length();j++) {      
				set.add(word.substring(i,j));          
			}
		}
		System.out.println(set.size());          
	}
}
