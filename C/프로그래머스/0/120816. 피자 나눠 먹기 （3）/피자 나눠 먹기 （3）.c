#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    // int answer = 0;
    // for(int i = 0; i<slice; i++){
    //     if(n/slice<i+1 || n/slice==i){
    //         answer=i;
    //     }
    // }
    int answer = 0;
    if(n%slice==0){
        answer = n/slice;
    }else{
        answer = n/slice+1;
    }
    return answer;
}