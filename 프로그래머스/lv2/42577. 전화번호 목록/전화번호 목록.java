import java.util.HashSet;
class Solution {
    public boolean solution(String[] phone_book) {

        // 중복제거
        HashSet<String> hs = new HashSet<>();

        for (var num : phone_book) {
            hs.add(num);
        }

        for (String phoneBook : phone_book) {
            for (int i = 0; i < phoneBook.length(); i++) {
                // 특정 값이 들어있는지 없는지 확인
                if (hs.contains(phoneBook.substring(0, i))) {
                    return false;
                }
            }
        }


        return true;
    }
}