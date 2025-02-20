class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){ //조건을 하기 위해서는 i는 1부터 시작
                answer += i;
            }
        }//for
        return answer;
    }
}