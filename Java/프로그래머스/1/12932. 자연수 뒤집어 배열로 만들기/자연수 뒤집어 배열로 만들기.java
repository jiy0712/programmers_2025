class Solution {
    public int[] solution(long n) {
        String nn = Long.toString(n); //long -> string으로 변환
        String[] n_string = nn.split(""); //한글자씩 잘라 string 배열에 넣기
        int[] answer = new int[n_string.length]; //answer 방을 n_string만큼 생성해두기
        for(int i=n_string.length-1; i>=0; i--){
            //맨뒷자리 값부터 가져와 맨앞에 넣으며 채우기
            answer[n_string.length-1-i] = Integer.parseInt(n_string[i]);
        }
        return answer;
    }
}