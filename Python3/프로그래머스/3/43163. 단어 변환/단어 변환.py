from collections import deque
def solution(begin, target, words):
    if target not in words:
        return 0
    q = deque([(begin, 0)])
    while q:
        x, cnt = q.popleft()
        for word in words:
            k = 0
            for i, y in zip(x, word):
                if i != y:
                    k += 1
            if k == 1 and word == target:
                return cnt + 1
            elif k == 1 :
                q.append((word, cnt+1))
    return 0