from collections import deque

def bfs(n, k):
    q = deque()
    q.append(n)
    visited = [-1] * 100001
    root = [-1] * 100001
    visited[n] = 1

    while q:
        x = q.popleft()
        if x == k:
            path = [] # 지나온 경로를 역 순으로 담을 리스트
            while x != -1: # 지난 적이 있다면 path에 추가
                path.append(x)
                x = root[x]
            return len(path) - 1, path[::-1]

        for i in (x-1, x+1, x*2):
            if 0 <= i <= 100000 and visited[i] == -1:
                q.append(i)
                visited[i] = 1
                root[i] = x  # root[i]에 전 값인 x를 넣는다.




N, K = map(int, input().split())


time, path = bfs(N, K)
print(time)
print(*path)