import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B); //내림차순 힘드니 다 오름차순으로 진행
        
        for(int i = 0; i<A.length; i++){
            answer += A[i] * B[B.length - i - 1]; // B총합숫자 - i - 1을 하며 내림차순
        }

        return answer;
    }
}