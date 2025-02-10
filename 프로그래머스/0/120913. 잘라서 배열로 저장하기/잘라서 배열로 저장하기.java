import java.util.ArrayList;

class Solution {
    public String[] solution(String str, int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i< (str.length()/n) ; i++)
        {
            list.add(str.substring((n*i),(n*(i+1))));
        }
        if(str.length()%n !=0)
        {
            list.add(str.substring((str.length()/n)*n));
        }
        String answer[] = new String[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}