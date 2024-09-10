class Solution {
    public int[] solution(int n) {
        int count = 0;
        if(n % 2 == 0) count = n / 2;
        else count = n / 2 + 1;
        
        int[] answer = new int[count];
        
        for(int i = 1; i <= n; i++) {
            if (i % 2 != 0) answer[i / 2] = i;
        }
        return answer;
    }
}