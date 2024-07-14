def solution(number, limit, power):
    answer = 0
    
    def count(n):
        cnt = 0
        for i in range(1, int(n**0.5) +1):  # n = a * b이므로 a와 b 중 하나는 반드시 n**0.5 이하이다
            if n % i == 0:
                cnt += 1
                if i != n //i:
                    cnt += 1
        return cnt
    
    for i in range(1, number + 1):
        maxPower = count(i)
        if maxPower > limit:
            answer += power
        else:
            answer += maxPower
    return answer