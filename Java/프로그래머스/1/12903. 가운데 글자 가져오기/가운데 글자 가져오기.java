class Solution {
    public String solution(String s) {
        String answer = "";
        int s_length = s.length(); //문자열 길이니 ()
        int among = 0;
        int among2 = 0;
        if(s_length%2 !=0){ //홀수라면
            among = ((int)Math.round(s_length/2.0)) -1; //반올림 후 저장
            
            //among 이용해 가운데 한글자 answer에 넣기
            //문자열 s에서 among에 해당하는 인덱스를 가져와 char -> string으로 변환해 반환
            answer = String.valueOf(s.charAt(among));
            
        }else if(s_length%2 ==0){ //짝수라면
            among = (s_length/2)- 1; //인덱스는 0부터 시작이니 우리가 생각하는 숫자에서 -1 해야한다.
            among2 = s_length/2;
            
            //among 이용해서 가운데 두글자 answer에 넣기
            //문자열 일부를 잘라 새로운 문자열로 answer에 넣는 것
            answer = s.substring(among, among2 + 1); // ~에서 ~미만이기 때문에 +1을 해야한다
        }
        return answer;
    }
}