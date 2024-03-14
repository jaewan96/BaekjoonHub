from collections import deque

def bfs(arr):
    maxN = 0
    q = deque(lst)

    while q:
        floor, r, c, cnt = q.popleft()
        maxN = max(maxN, cnt)

        for d in range(6):

            newR = r + dr[d]
            newC = c + dc[d]
            newZ = floor + dz[d]
            if 0 <= newR < N and 0 <= newC < M and 0<= newZ < H and arr[newZ][newR][newC] == 0:
                arr[newZ][newR][newC] = 1
                q.append((newZ, newR, newC, cnt+1))

    for z in range(H):
        for i in range(N):
            for j in range(M):
                if arr[z][i][j] == 0:
                    return -1
    return maxN


M, N, H = map(int, input().split())
arr = [ [list(map(int, input().split()))for _ in range(N)]for _ in range(H)]
# print(arr)
box = [[[0] * M for _ in range(N)] for _ in range(H)]
# print(box)
dr = [0, 0, 0, 0, 1, -1]
dc = [1, -1, 0, 0, 0, 0]
dz = [0, 0, 1, -1, 0, 0]
lst = []

for z in range(H):
    for i in range(N):
        for j in range(M):
            if arr[z][i][j] == 1:
                box[z][i][j] = 1
                lst.append((z, i, j, 0))

print(bfs(arr))