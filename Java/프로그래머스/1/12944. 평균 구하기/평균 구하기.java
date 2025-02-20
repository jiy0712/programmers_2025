class Solution {
    public double solution(int[] arr) {
        //반환값이 double이 나올 수 있을 때 되도록 다 double로 하기
        double answer = 0.0;
        double count = 0.0;
        double hap = 0.0;
        for(int i = 0; i<arr.length; i++){
            hap += arr[i];
            count ++;
        }
        answer = hap/count;
        return answer;
    }
}