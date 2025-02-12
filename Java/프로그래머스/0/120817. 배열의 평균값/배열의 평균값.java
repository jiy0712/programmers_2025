class Solution {
    public double solution(int[] numbers) {
        int i = 0;
        double num = 0;
        for(i = 0; i<numbers.length; i++){
            num += numbers[i];
        }
        double answer = num/numbers.length;
        
        return answer;
    }
}