class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        //1부터 시작
        for(i = 1; i<n; i++){
            if(n%i==1){
                //여기서 바로 반환
                //안그러면 첫번째로 찾은게 안들어가고 마지막꺼가 들어가버린다
                return i;
            }
        }
        return -1; //for문 이후에 아무것도 반환되지 않았을때도 이렇게 해줘야한다
    }
}