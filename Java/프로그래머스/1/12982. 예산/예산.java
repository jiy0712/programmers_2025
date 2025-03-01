import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); //오름차순 정렬
        int hap = 0;
        for(int i = 0; i<d.length; i++){
            hap += d[i];
            if(hap<=budget){ //금액지원금이 더 많거나 딱 된다면
                answer ++;
            }else{
                break;
            }
        }
        return answer;
    }
}