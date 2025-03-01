class Solution {
    public boolean solution(String s) {
        int s_length = s.length();
        
        if(s_length != 4 && s_length != 6){
            return false;    
        }
        
        for(char i : s.toCharArray()){
            if (!Character.isDigit(i)){
                return false;
            }
        }
        
        return true;
    }
}