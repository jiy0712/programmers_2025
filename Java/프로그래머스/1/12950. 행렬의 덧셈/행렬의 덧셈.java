class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length]; //이차원 배열 생성
        for(int i = 0; i<arr1.length; i++){
            //이차원 배열이니 arr1[0]을 이용해야한다
            for(int j = 0; j<arr1[0].length; j++){
                answer[i][j] += arr1[i][j];
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}