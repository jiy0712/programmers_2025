class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        //문자열 -> 배열 변환
        String[] ss = s.split("");
        
        for(int i = 0; i<ss.length; i++){
            //java에서 같다 할때는 .equals
            if(ss[i].equals("p") || ss[i].equals("P")){
                p ++;
            }else if(ss[i].equals("y") || ss[i].equals("Y")){
                y ++;
            }
        }
        if(p==y){
            return true;
        }else{
            return false;
        }
    }
}