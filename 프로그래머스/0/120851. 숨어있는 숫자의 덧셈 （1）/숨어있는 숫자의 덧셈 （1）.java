class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]","");
        my_string = my_string.replaceAll("[A-Z]","");
        String[] arr = my_string.split("");
        for(int i = 0 ; i<arr.length;i++){
            answer = answer+ Integer.parseInt(arr[i]);
        }
        return answer;
    }
}