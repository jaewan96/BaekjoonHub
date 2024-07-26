def solution(n):
    answer = 0
    num = 1
    while num * (num - 1) // 2 < n:
        if (n - num * (num - 1) // 2) % num == 0:
            answer += 1
        num += 1
    return answer