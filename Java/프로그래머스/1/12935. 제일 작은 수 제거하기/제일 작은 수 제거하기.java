class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1]; //작은 수 빼고니 -1
        
        if(arr.length == 1){
            return new int[]{-1}; //배열로 반환
        }
        
        int min = arr[0]; //젤 앞에꺼 먼저 넣어두고
        //foreach문. for (데이터타입 변수명 : 배열)
        //배열 요소를 변수명에 하나씩 넣으며 반복. 값을 변경하지 않고 값만 읽으며 찾을때 사용가능
        for (int i : arr) {
            if (i < min) { //작은 수 찾기
                min = i;
            }
        }
        
        int j = 0;
        for (int i: arr) {
            if (i != min) { //작은수와 같지 않으면 배열안에 추가
                answer[j++] = i;
            }
        }
        
        return answer;
    }
}