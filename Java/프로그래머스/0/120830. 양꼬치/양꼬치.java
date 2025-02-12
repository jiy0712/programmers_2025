class Solution {
    public int solution(int n, int k) {
        int skewer = 12000*n; //양꼬치 가격
        int service = n/10; //서비스 음료 개수
        int drink = 2000*(k-service); //음료 가격(서비스 음료 제외)
        int answer = skewer+drink;
        return answer;
    }
}