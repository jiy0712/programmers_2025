import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        //배열로 전환
        String[] arr = s.split("");

        //배열 오름차순 정렬이지만 Collections.reverseOrder로 내림차순 정렬이 됨
        Arrays.sort(arr, Collections.reverseOrder());
 
        for(int i = 0; i<arr.length; i++){
            answer += arr[i]; //내림차순 정렬 된 배열을 다시 문자열로 집어넣기
        }
        return answer;
    }
}