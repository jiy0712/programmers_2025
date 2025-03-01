class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            int count = 0; //숫자 변할때마다 카운트 초기화
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    count ++;
                }
            }
            if(count % 2 == 0){ //약수의 개수가 짝수인 수는 더하고,
                answer += i;
            } else { //홀수면 빼기
                answer -= i;
            }
        }
        return answer;
    }
}