import java.util.Arrays;

class Solution {
    public String solution(String my_string, String letter) {
        //string -> 배열로
        char[] my_char = new char[my_string.length()];
        //string -> char로
        char letter_char = letter.charAt(0);
        
        String answer = "";
        
        //배열안에 char로 각각 값 넣기
        for (int i = 0; i<my_string.length(); i++) {
            my_char[i] = my_string.charAt(i);
        }
        
        //특정 문자 제거하기
        for(int i = 0; i<my_char.length; i++){
            if(my_char[i]==letter_char){
                continue;
            }else{
                answer += my_char[i];
            }
        }
        return answer;
    }
}