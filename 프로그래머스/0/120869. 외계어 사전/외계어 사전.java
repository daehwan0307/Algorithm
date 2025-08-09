import java.util.*;  
class Solution {
    public int solution(String[] spell, String[] dic) {
    
        char[] target = String.join("", spell).toCharArray();
        Arrays.sort(target);
        String key = new String(target);

        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() != spell.length) continue; 

            char[] arr = dic[i].toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            if (key.equals(sortedWord)) {
                return 1; 
            }
        }
        return 2; 
    }
}
