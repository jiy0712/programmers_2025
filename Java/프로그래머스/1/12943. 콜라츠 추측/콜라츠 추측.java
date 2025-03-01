class Solution {
    public int solution(int num) {
        
        if (num == 1) return 0; //num이 처음부터 1일때를 고려해야한다
        
        long n = num; //int 오버플로우 발생때문에
        for(int i = 1; i<=500; i++){ //500번 반복할 때까지
            if(n%2==0){
                n /=2;
            }else{ //홀수라면
                n = (n*3) + 1;
            }
            if(n==1){ //짝홀 확인과 1확인을 따로 진행해야한다
                return i;
            }
        }
        //1이 되지 않는다면 -1 반환
        return -1;
    }
}