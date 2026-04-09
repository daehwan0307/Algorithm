class Solution {
    public String solution(String s) {
       String[] words = s.split(" ", -1); // -1: 빈 문자열도 보존
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        for (int j = 0; j < words[i].length(); j++) {
            if (j % 2 == 0) {
                result.append(Character.toUpperCase(words[i].charAt(j)));
            } else {
                result.append(Character.toLowerCase(words[i].charAt(j)));
            }
        }
        if (i < words.length - 1) {
            result.append(" ");
        }
    }

    return result.toString();
    }
}