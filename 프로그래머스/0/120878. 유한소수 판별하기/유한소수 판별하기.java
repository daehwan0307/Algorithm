import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int num = get(a,b);
        int stand = b/num;
        
        while(stand%2==0){
            stand= stand/2;
        }
         while(stand%5==0){
            stand= stand/5;
        }
        
        if(stand ==1){
            return 1;
        }else
        {
            return 2;
        }

      
    }
    
    public int get(int a, int b){
        
        while(b%a!=0){
         int temp = b%a;
         b = a;
          a= temp;
        }
        return a;
        
    }
    
    
}