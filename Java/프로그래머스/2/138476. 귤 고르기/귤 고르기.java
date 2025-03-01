import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int[] k_count = new int[10000001]; //tangerine 원소 최대까지
        
        //귤 크기 별 개수
        for (int i : tangerine) { //tangerine의 값을 i에 하나씩 읽게 하면서 반복
            k_count[i]++; //i 크기의 배열 인덱스를 증가함으로써 개수 세기
        }
        
        //개수 내림차순 (종류를 최소로 해야하니까)
        //내림차순 한 k_count를 count 배열에 저장
        int[] count = Arrays.copyOf(k_count, k_count.length);
        Arrays.sort(count); //배열 오름차순 설정
        
        int total = 0; // 귤 총 개수 (k를 위해)
        int answer = 0; // 귤 종류 개수

        for (int i = count.length -1; i>=0; i--) { //역순으로 내려가며 반복
            if (count[i] == 0) { //귤이 없다면 종료
                break;
            }
            
            total += count[i]; //count배열만큼 귤 개수 증가
            answer++; //종류증가
            
            if (total>=k) { //귤 k만큼 했으면 종료
                break;
            }
        }

        return answer;
    }
}