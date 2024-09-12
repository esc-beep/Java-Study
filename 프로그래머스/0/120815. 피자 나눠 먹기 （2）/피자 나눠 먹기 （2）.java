class Solution {
    public int solution(int n) {
        int lcm = 6 * n / gcd(6, n);
        int answer = lcm / 6;
        
        return answer;
    }
    
    public static int gcd(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return gcd(num2, num1 % num2);
    }
}