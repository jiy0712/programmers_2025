class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int t_length = t.length()-p.length()+1;
        //t숫자 - p숫자 + 1 ==> t에서 p만큼 숫자를 잘라낼 수 있는 횟수가 된다
        for(int i = 0; i<t_length; i++){
            String tp = t.substring(i, i + p.length()); //문자열 잘라내기
            if(Long.parseLong(tp)<=Long.parseLong(p)){
                answer ++;
            }
        }
        return answer;
    }
}