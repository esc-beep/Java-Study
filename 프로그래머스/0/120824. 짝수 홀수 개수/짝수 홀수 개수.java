class Solution {
    public int[] solution(int[] num_list) {
        int flag = 0;
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) flag++;
        }
        int[] answer = {flag, num_list.length - flag};
        return answer;
    }
}