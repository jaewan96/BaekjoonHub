def solution(n, s):
    if s // n < 1:
        return [-1]
    else:
        num = s // n
        k = s % n
        return [num] * (n-k) + [num +1] * k
  