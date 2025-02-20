import java.util.*;
import java.util.stream.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 숫자 n을 문자열로 바꾸고 숫자숫자마다 ""로 나누기
        int[] nn = Stream.of(String.valueOf(n).split(""))
                //메서드 체이닝(점을 이용해 하나의 객체에 여러 메서드를 호출)
                .mapToInt(Integer::parseInt) // 각 문자열을 정수로 변환
                .toArray(); // 배열로 반환

        // 자릿수
        int n_length = (int) (Math.log10(n) + 1);

        for (int i = 0; i<n_length; i++) {
            answer += nn[i];
        }

        return answer;
    }
}
