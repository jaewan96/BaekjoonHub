def solution(n):
    answer = 0
    num = int(n**0.5)
    if n == num ** 2:
        answer = (num + 1) ** 2
    else:
        answer = -1
    return answer