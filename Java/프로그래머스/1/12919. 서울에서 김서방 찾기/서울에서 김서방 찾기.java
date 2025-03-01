class Solution {
    public String solution(String[] seoul) {
        for(int i = 0; i<seoul.length; i++){  
            if(seoul[i].equals("Kim")){ //equals사용
                //count 없이 바로 i를 이용해 return 할 수 있다
                return "김서방은 " + i + "에 있다";
            }
        }
        return ""; //잘 안된 경우
    }
}