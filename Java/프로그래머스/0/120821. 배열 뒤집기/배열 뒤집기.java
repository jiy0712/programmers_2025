class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; //num_list만큼 방을 만들어준다
        int length = num_list.length;
        for(int i = 0; i<length; i++){
            //num_list 길이 - i - 1을 하면 반대로 숫자를 넣을 수 있다
            answer[length - i - 1] += num_list[i];
        }
        return answer;
    }
}