def solution(numbers):
    i = 0
    num = 0.0
    for i in range(len(numbers)):
        num += numbers[i]
    answer = num/len(numbers)

    return answer