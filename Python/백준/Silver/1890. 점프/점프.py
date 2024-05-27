N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
dp = [[0 for _ in range(N)] for _ in range(N)]  # 각 지점에서 갈 수 있는 경로의 개수
dp[0][0] = 1
for i in range(N):
    for j in range(N):
        if dp[i][j] == 0 or arr[i][j] == 0:
            continue

        jump = arr[i][j] # 이동할 칸 수
        if i + jump < N:
            dp[i + jump][j] += dp[i][j] # 갈 수 있는 경로의 개수
        if j + jump < N:
            dp[i][j + jump] += dp[i][j]
print(dp[N-1][N-1])