from collections import deque
import sys
def bfs():
    global result, start
    # visited[x][y] = 1
    q = deque(start)
    # q.append(start)
    next = deque()

    # q.append((x,y))
    while q:
        r, c = q.popleft()
        if r == lst[1][0] and c == lst[1][1]:
            result = True
            return
        for d in range(4):
            newR = r + dr[d]
            newC = c + dc[d]
            if 0<= newR < R and 0<= newC < C and visited[newR][newC] == 0:
                if arr[newR][newC] != 'X':
                    visited[newR][newC] = 1
                    q.append((newR, newC))
                elif arr[newR][newC] == 'X':
                    visited[newR][newC] = 1
                    # arr[newR][newC] = '.'
                    next.append((newR, newC))
    return next



def melt():
    # visited_melt[x][y] = 1
    q = deque(water)
    ice = deque()
    # q.append((x, y))
    while q:
        r, c = q.popleft()
        for d in range(4):
            newR = r + dr[d]
            newC = c + dc[d]
            if 0<= newR < R and 0 <= newC < C and visited_melt[newR][newC] == 0:
                if arr[newR][newC] == '.':
                    visited_melt[newR][newC] = 1
                    q.append((newR, newC))

                elif arr[newR][newC] == 'X' :
                    arr[newR][newC] = '.'
                    visited_melt[newR][newC] = 1
                    ice.append((newR, newC))
    return ice

R, C = map(int, sys.stdin.readline().split())
arr = [list(sys.stdin.readline()) for _ in range(R)]
dr = [1, -1, 0, 0]
dc = [0, 0, 1, -1]
lst = []
result = False
cnt = 0
water = []
visited_melt = [[0] * C for _ in range(R)]
visited = [[0]*C for _ in range(R)]
for r in range(R):
    for c in range(C):
        if arr[r][c] == 'L':
            lst.append((r, c))
            water.append((r,c))
            # visited[r][c] = 1
            # visited_melt[r][c] = 1
            # start = (r, c)
        elif arr[r][c] == '.':
            water.append((r, c))
            # visited_melt[r][c] = 1
start = [(lst[0][0], lst[0][1])]

while result == False:
    start = bfs()
    if result == True:
        break
    water = melt()
    cnt += 1



print(cnt)