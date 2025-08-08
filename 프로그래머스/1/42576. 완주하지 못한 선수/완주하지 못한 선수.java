import java.util.*;
class Solution {
  public String solution(String[] participant, String[] completion) {
            String answer = "";

            Map<String,Integer> list = new HashMap<>();
            for(int i=0; i< participant.length;i++){
                if(list.containsKey(participant[i])){
                    list.compute(participant[i], (k, temp) -> temp + 1);
                }else {
                    list.put(participant[i], 1);
                }
            }

            for(int i=0; i<completion.length; i++){
                if(list.containsKey(completion[i])){
                    list.compute(completion[i], (k, temp) -> temp - 1);
                }
            }
            for (Map.Entry<String, Integer> entry : list.entrySet()) {
                if (entry.getValue() == 1) {
                    answer = entry.getKey();
                    break;
                }
            }

            return answer;
        }
}