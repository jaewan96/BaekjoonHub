def solution(numbers):
    answer = []
    sum_lst = []
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            sum_lst.append(numbers[i] + numbers[j])
    set_sum = set(sum_lst)
    answer = list(set_sum)
    answer.sort()
    return answer