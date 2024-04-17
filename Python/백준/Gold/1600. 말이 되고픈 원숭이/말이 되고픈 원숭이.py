from collections import deque
import sys
def bfs():
    result = -1
    q = deque()
    q.append((0, 0, 0, 0))
    visited[0][0][0] = 1
    while q:
        floor, r, c, cnt = q.popleft()
        if r == H-1 and c == W-1:
            result = cnt
            return result

        for d in range(12):
            newR = r + dr[d]
            newC = c + dc[d]
            if 0<= newR < H and 0<= newC < W and  arr[newR][newC] == 0:
                if d < 4 :
                    if visited[floor][newR][newC] == -1:
                        visited[floor][newR][newC] = 1
                        q.append((floor, newR, newC, cnt+1))

                elif d >= 4 and floor+1 <= K:
                    if visited[floor+1][newR][newC] == -1:
                        visited[floor+1][newR][newC] = 1
                        q.append((floor+1, newR, newC, cnt+1))

    return result




K = int(sys.stdin.readline())
W, H = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(H)]
dr = [1, -1, 0, 0, 2, 2, 1, -1, -2, -2, 1, -1]
dc = [0, 0, 1, -1, 1, -1, 2, 2, 1, -1, -2, -2]
visited = [[[-1]*W for _ in range(H)] for _ in range(K+1)]
print(bfs())


