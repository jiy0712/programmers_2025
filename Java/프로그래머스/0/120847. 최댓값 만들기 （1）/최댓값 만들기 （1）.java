//Arrays 사용하기 위해서 필요한 improt
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        //오름차순으로 정렬 후 length를 이용해 최대값과 그 다음으로 큰 값을 구해 계산할 수 있다
        Arrays.sort(numbers);
        int length = numbers.length;
        return numbers[length - 1] * numbers[length - 2];
        
        //만약 최대값과 그 다음으로 큰 값이 같을때는 풀 수 없기 때문이다
        // int answer = 0;
        // int max = 0;
        // int nextmax = 0;
        // for(int i = 0; i<numbers.length; i++){
        //     if(max<numbers[i]){
        //         max = numbers[i];
        //     }
        // }
        // for(int j = 0; j<numbers.length; j++){
        //     if(nextmax<numbers[j]){
        //         if(max != numbers[j]){
        //             nextmax = numbers[j];   
        //         }
        //     }
        // }
        // answer = max*nextmax;
        // return answer;
    }
}