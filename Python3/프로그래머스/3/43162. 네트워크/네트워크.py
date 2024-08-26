from collections import deque
def solution(n, computers):
    answer = 0
    for i in range(n):
        if computers[i][i] == 1:
            computers[i][i] = 0
            answer += 1
            q = deque([i])
            while q:
                x = q.popleft()
                for k in range(n):
                    if computers[x][k] == 1:
                        computers[x][k] = 0
                        computers[k][x] = 0
                        q.append(k)
    return answer
 