class Solution {
    public String solution(String phone_number) {
        String[] phone_number_arr = phone_number.split("");
        int count = 0;
        String answer = "";
        for(int i = 0; i<phone_number_arr.length; i++){
            if(phone_number_arr.length - count <= 4){
                answer += phone_number_arr[i];
            }else{
                answer += "*";
            }
            count ++;
        }
        return answer;
    }
}