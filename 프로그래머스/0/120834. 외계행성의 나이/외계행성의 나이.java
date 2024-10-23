class Solution {
    public String solution(int age) {
     String alpha = "abcdefghij";
        
        // 변환된 결과를 저장할 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();
        
        // age가 0보다 큰 동안 반복
        while (age > 0) {
            // age의 마지막 자리 숫자를 알파벳으로 변환하여 StringBuilder의 앞에 삽입
            sb.insert(0, alpha.charAt(age % 10));
            age /= 10; // age를 10으로 나누어 자리수를 제거
        }
        
        // 변환된 문자열을 반환
        return sb.toString();
    }
}