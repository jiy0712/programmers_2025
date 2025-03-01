class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long payment = 0; //지불할 금액
        for(int i = 1; i<=count; i++){
            payment += price*i;
        }
        if(payment>money){
            answer = payment - money;
        }else if(money>=payment){
            return 0; //금액이 부족하지 않으면
        }
        return answer;
    }
}