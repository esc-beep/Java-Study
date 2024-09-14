import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] emergency_sort = emergency.clone();
        int[] answer = new int[emergency.length];
        Arrays.sort(emergency);
        for(int i = 0; i < emergency_sort.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if (emergency_sort[i] == emergency[j])
                    answer[i] = emergency.length - j;
            }
        }
        return answer;
    }
}