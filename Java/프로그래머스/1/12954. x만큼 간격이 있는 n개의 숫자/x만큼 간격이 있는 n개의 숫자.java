class Solution {
    public long[] solution(int x, int n) {
        //배열 초기화
        long[] answer = new long[n];
        
        int count = 0;
        long repetition = x; // 반복되는 값 (int로 하면 오버플로우 발생할수도 있기 때문에)
        
        for(int i = 0; i<n; i++){
            answer[i] = repetition;
            repetition += x;
            count++;
        }
        return answer;
    }
}
