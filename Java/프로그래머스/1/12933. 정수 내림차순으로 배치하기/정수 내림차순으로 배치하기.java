import java.util.Arrays; //Arrays.sort을 사용하기 위해
import java.util.Collections; //Collections.reverseOrder을 사용하기 위해
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] n_string = Long.toString(n).split(""); //한개씩 잘라 string 배열에 넣기
        Arrays.sort(n_string, Collections.reverseOrder()); //배열을 내림차순으로 정렬
        
        String answer_string = "";
        //for-each문
        for(String s : n_string) //n_string의 것을 s에 하나씩 담아
           answer_string += s; //answer_string에 하나씩 저장
        answer = Long.parseLong(answer_string); //string -> long으로 다시 바꿈
        
        return answer;
    }
}