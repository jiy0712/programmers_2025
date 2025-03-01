class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split(" ");
        int[] arr = new int[ss.length];
        
        //문자열 배열 -> 정수 배열로 변환
        for(int i = 0; i<ss.length; i++){
            arr[i] = Integer.parseInt(ss[i]);
        }
        
        //처음 값을 임시지정
        int max = arr[0];
        int min = arr[0];
        
        //배열 반복하며 max와 min 찾기
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        answer = min + " " + max;
        
        return answer;
    }
}