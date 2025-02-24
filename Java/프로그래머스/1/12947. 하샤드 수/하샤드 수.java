class Solution {
    public boolean solution(int x) {
        boolean answer = false; //하샤드 수가 아니면
        int xx = x;
        int hap = 0;
        while(xx!=0){ //x가 0이 아니면 반복
            hap += xx%10; //x를 10으로 나눈 나머지를 hap에 저장 (그럼 자릿수만 저장됨)
            xx /= 10; //10으로 나눈 값으로 다시 저장하며 그 다음 자릿수를 저장
        }
        if(x%hap == 0){ //x 나누기 hap을 했을때 나머지가 없다면
            answer = true; //하샤드 수이므로 true
        }
        return answer;
    }
}