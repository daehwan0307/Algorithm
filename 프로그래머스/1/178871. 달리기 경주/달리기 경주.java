import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            hm.put(players[i],i);
            }
        
        for(int i=0;i<callings.length;i++){
           int temp =  hm.get(callings[i]);
            String nm = players[temp-1];
            players[temp-1]= callings[i];
            players[temp] = nm;
            hm.put(callings[i], temp - 1);
            hm.put(nm, temp);
        }
        return players;
    }
}