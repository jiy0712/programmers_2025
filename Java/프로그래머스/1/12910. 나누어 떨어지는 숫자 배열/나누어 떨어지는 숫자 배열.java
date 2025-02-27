import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        //해당하는 숫자가 몇개인지 찾기
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                count ++;
            }
        }
        
        if (count==0) {
            //축약형으로 배열을 즉시 생성하고 -1을 반환
            return new int[]{-1};
        }
        
        //숫자 넣을 배열 생성
        int[] answer = new int [count];
        int j = 0;
        
        //숫자 배열에 넣기
        for(int i = 0; i<arr.length; i++){
            if (arr[i] % divisor == 0) {
                answer[j++] = arr[i]; //answer[i]로 하지않고 j++을 이용해 따로 해야한다
            }
        }
        //오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}