from collections import deque

def solution(priorities, location):
    answer = 0
    q = deque([(priority, idx) for idx, priority in enumerate(priorities)])
    cnt = 0
    while q:
        num = q.popleft()
        if any(num[0] < i[0] for i in q):
            q.append(num)
        else:
            cnt += 1
            if num[1] == location:
                return cnt