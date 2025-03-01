class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){ //빈병 개수 >= 필요한 병 개수
            int i = (n/a) * b; //교환할 수 있는 콜라
            answer += i; //받은 콜라
            n = (n%a) + i; //빈병
        }
        return answer;
    }
}