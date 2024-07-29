from collections import deque
def solution(numbers, target):
    cnt = 0
    q = deque([(numbers[0], 0), (-numbers[0], 0)])
    while q:
        num, idx = q.popleft()
        if idx == len(numbers)-1:
            if num == target:
                cnt +=1
        else:
            for i in [numbers[idx+1], -numbers[idx+1]]:
                q.append((i+num, idx+1))
    return cnt
    
    