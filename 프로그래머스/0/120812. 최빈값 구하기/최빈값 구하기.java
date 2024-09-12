import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int[] frequency = new int[array[array.length - 1] + 1];
        
        for(int i : array) {
            frequency[i]++;
        }
        
        int top = frequency[0];
        for(int i = 1; i < frequency.length; i++) {
            if (top < frequency[i]) {
                top = frequency[i];
                answer = i;
            }
            else if (top == frequency[i]) answer = -1;
        }
        return answer;
    }
}