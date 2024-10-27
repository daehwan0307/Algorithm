import java.util.*;
class Solution {
    public String solution(String letter) {
        HashMap<String, String> map = new HashMap<>();
        
        // 2. 결과 문자열을 저장할 StringBuilder 초기화
        StringBuilder sb = new StringBuilder();
        
        // 3. Morse 코드와 알파벳을 매핑한 배열 정의
        String[] morseArr = {
            ".- a", "-... b", "-.-. c", "-.. d", ". e", "..-. f",
            "--. g", ".... h", ".. i", ".--- j", "-.- k", ".-.. l",
            "-- m", "-. n", "--- o", ".--. p", "--.- q", ".-. r",
            "... s", "- t", "..- u", "...- v", ".-- w", "-..- x",
            "-.-- y", "--.. z"
        };
        
        // 4. Morse 코드와 알파벳을 HashMap에 저장
        for (String morse : morseArr) {
            // Morse 코드와 알파벳을 분리
            String[] splitMorse = morse.split(" ");
            String key = splitMorse[0];  // Morse 코드
            String value = splitMorse[1]; // 알파벳
            
            // HashMap에 Morse 코드와 알파벳 매핑 저장
            map.put(key, value);
        }
        
        // 5. 입력된 Morse 코드 문자열을 공백으로 분리하여 처리
        for (String s : letter.split(" ")) {
            // HashMap에서 Morse 코드에 해당하는 알파벳을 찾아 결과 문자열에 추가
            sb.append(map.get(s));
        }
        
        // 6. 최종 결과 문자열 반환
        return sb.toString();
    }
}