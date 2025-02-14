def solution(num_list):
    #for문과 len을 이용해 answer에 방을 만들어두고
    answer = [0 for i in range(len(num_list))]
    length = len(num_list)
    #거꾸로 num_list의 숫자들을 넣는다
    for i in range(length):
        answer[length - i - 1] += num_list[i]
    return answer