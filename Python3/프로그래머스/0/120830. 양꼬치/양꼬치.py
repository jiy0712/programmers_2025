def solution(n, k):
    answer = 0
    skewer = 12000*n #양꼬치 가격
    service = int(n/10) #서비스 음료 개수
    drink = 2000*(k-service) #음료 가격(서비스 음료 제외)
    answer = skewer+drink
    return answer