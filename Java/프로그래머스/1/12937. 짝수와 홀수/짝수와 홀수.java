class Solution {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){ //짝수라면
            answer = "Even";
        }else{ //홀수라면
            answer = "Odd";
        }
        return answer;
    }
}