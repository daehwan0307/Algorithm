import java.util.*;
class Solution {
        public int solution(String[][] clothes) {

     HashMap<String, Integer> closet = new HashMap<>();
    for(String[] cloth : clothes) {
      closet.put(cloth[1], closet.getOrDefault(cloth[1], 0) + 1);
    }
       
    
            
        int result = 1;
            for(String s : closet.keySet()) {
              result= result*(closet.get(s)+1);
            }
            
        
        return result -1;
        }
}