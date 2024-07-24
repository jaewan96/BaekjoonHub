def solution(n):
    num = format(n, 'b')
    cnt = num.count('1')
    while True:
        n += 1
        num = format(n, 'b')
        want = num.count('1')
        if cnt == want:
            return n