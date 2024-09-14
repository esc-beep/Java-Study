class Solution {
    public int solution(int n) {
        int answer = 0;
        int check = 1;
        int i = 1;
        while(i < 11) {
            check = check * i;
            if (check > n) {
                answer = i - 1;
                break;
            } 
            if (check == n) {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}