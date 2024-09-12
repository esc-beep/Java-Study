class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morse_letter = letter.split(" ");
        
        for(int i = 0; i < morse_letter.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(morse[j].equals(morse_letter[i])) 
                    answer += (char) (j + 97);
            }
        }
        return answer;
    }
}