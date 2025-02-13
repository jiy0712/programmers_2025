def solution(angle):
    answer = 0
    if(angle<90):
        answer = 1 #예각
    elif(angle==90):
        answer = 2 #직각
    elif(angle<180):
        answer = 3 #둔각
    elif(angle==180):
        answer = 4 #평각
    return answer