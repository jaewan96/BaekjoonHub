from collections import deque
import sys
def bfs(v):
    global num, cnt
    visited[v] = 1
    q = deque()
    q.append(v)
    while q:
        i = q.popleft()
        if i == K :
            num = visited[i]
            cnt +=1
            # visited[i] = 0



        for d in [i*2, i-1, i+1]:
            if 0<= d < 100001 and visited[d] >= visited[i]+1:
                visited[d] = 1+ visited[i]
                q.append(d)

N, K = map(int, sys.stdin.readline().split())
visited = [100001]*(100001)

num = 10000001
cnt = 0
bfs(N)
print(num-1)
print(cnt)