import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character,Integer> ms = new HashMap<>();
        ms.put('R',0);
        ms.put('T',0);
        ms.put('C',0);
        ms.put('F',0);
        ms.put('J',0);
        ms.put('M',0);
        ms.put('A',0);
        ms.put('N',0);
        
        for(int i=0; i<survey.length;i++){
            if(choices[i]==1){
                ms.put(survey[i].charAt(0),ms.get(survey[i].charAt(0))+3);
            }
             if(choices[i]==2){
                ms.put(survey[i].charAt(0),ms.get(survey[i].charAt(0))+2);
            }
             if(choices[i]==3){
                ms.put(survey[i].charAt(0),ms.get(survey[i].charAt(0))+1);
            }
             if(choices[i]==5){
                ms.put(survey[i].charAt(1),ms.get(survey[i].charAt(1))+1);
            }
             if(choices[i]==6){
                ms.put(survey[i].charAt(1),ms.get(survey[i].charAt(1))+2);
            }
             if(choices[i]==7){
                ms.put(survey[i].charAt(1),ms.get(survey[i].charAt(1))+3);
            }
            
        }
     StringBuilder sb = new StringBuilder();
        if(ms.get('R') >= ms.get('T')) sb.append("R"); else sb.append("T");
if(ms.get('C') >= ms.get('F')) sb.append("C"); else sb.append("F");
if(ms.get('J') >= ms.get('M')) sb.append("J"); else sb.append("M");
if(ms.get('A') >= ms.get('N')) sb.append("A"); else sb.append("N");
        answer = sb.toString();
        
        return answer;
    }
}