class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i<=9; i++){ //0부터 9까지의 숫자
            for(int j = 0; j<numbers.length; j++){
                if(i == numbers[j]){
                    count ++;
                }
            }
            if(count == 0){
                answer += i;
            }
            count = 0;
        }
        return answer;
    }
}