class Solution {
    public long solution(long n) {    
        long answer = -1; //양의 정수의 제곱이 아니면 -1 리턴

        double sqrt = Math.sqrt(n); //sqrt는 n의 제곱근을 계산함
        if (sqrt == (int)sqrt) { // 제곱근이 정수라면 (n이 양의 정수라는 뜻이므로)
            answer = (long)(sqrt + 1)*(long)(sqrt + 1);
        }

        return answer;
        
        //전 코드의 문제 : 시간초과
        // long answer = -1; //양의 정수의 제곱이 아니면 -1 리턴
        // //i의 제곱이 n보다 같거나 작으면 반복
        // for (int i = 1; i*i <= n; i++) { //i=0부터 시작이면 숫자/0이 되므로 1부터
        //     if (i*i == n) { //i의 제곱이 n과 같다면
        //         answer = (i + 1)*(i + 1);
        //         break; //빠져나오기
        //     }
        // }
        // return answer;
    }
}