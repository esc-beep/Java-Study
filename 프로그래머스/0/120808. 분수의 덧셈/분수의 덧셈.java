class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        answer[0] = denom1 * numer2 + denom2 * numer1;
        answer[1] = denom1 * denom2;
        int max = 0;
        for(int i = 1; i <= Math.min(answer[0], answer[1]); i++) {
            if ((answer[0] % i == 0) && (answer[1] % i == 0)) {
                max = i;
            }
        }
        answer[0] = answer[0] / max;
        answer[1] = answer[1] / max;
        return answer;
    }
}