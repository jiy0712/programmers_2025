import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); //오름차순
        int answer = 0;
        int light = 0; // 가장 가벼운 사람을 가리키는 변수
        
        // 1 2 3 4 5 가 있다면 1,5 2,4 이렇게 겉에서부터 짝지어 비교해보는 방식
        for (int i = people.length - 1; i>=light; i--) {
            if (people[i] + people[light] <= limit) {
                // 가장 무거운 사람과 가장 가벼운 사람을 태울 수 있으면
                answer++; //구명보트 1개 추가
                light++; //다음으로 가벼운 사람으로 넘어간다
            } else {  
                answer++; //무거운 사람만 태운다
            }
        }
        return answer;
    }
}
