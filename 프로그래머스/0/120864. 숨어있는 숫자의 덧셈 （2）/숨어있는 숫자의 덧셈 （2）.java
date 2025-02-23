class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] check = my_string.split("[a-zA-Z]");
        for (int i = 0; i < check.length; i++) {
            if(!check[i].equals("")){
                answer += Integer.parseInt(check[i]);
            }
        }
        return answer;
    }
}