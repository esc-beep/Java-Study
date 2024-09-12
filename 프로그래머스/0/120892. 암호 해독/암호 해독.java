import java.util.ArrayList;

class Solution {
    public String solution(String cipher, int code) {
        ArrayList<String> list = new ArrayList<>();
        int index = code - 1;
        while(index < cipher.length()) {
            list.add(cipher.substring(index, index + 1));
            index += code;
        }
        String answer = String.join("", list);
        return answer;
    }
}