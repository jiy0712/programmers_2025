class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){ //a가 더 클때
            for(int i = b; i<=a; i++){
            answer += i;
            }
        }else{ //b가 더 클때
            for(int i = a; i<=b; i++){
            answer += i;
            }
        }
        return answer;
    }
}