def solution(n):
    s = 0
    e = 1
    for i in range(2, n+1):
        k = e
        e = s + e
        s = k
    answer = e % 1234567
    return answer