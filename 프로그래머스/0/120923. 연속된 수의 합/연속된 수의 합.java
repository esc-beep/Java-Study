class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int number = 0;
        
        if (num % 2 == 0) {
            number = total / num;
            number = number - num / 2 + 1;
        } else {
            number = total / num;
            number = number - num / 2;
        }
        for(int i = 0; i < num; i++) {
            answer[i] = number;
            number++;
        }
        return answer;
    }
}