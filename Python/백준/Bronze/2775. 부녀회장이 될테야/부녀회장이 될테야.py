def func(k, n):
    dp = [[0] * (n  + 1) for _ in range(k+1)]  # 각 층에 몇명이 살고 있을지 담을 array
    for i in range(0, k+1):
        for j in range(0, n+1):
            if i == 0:
                dp[i][j] = j
            else:
                if j == 0:
                    dp[i][j] = dp[i - 1][j]
                else:
                    dp[i][j] = dp[i][j-1] + dp[i-1][j]
    return print(dp[k][n])

T = int(input()) # Test case의 수
for _ in range(T):
    k = int(input()) # 층
    n = int(input()) # 호
    func(k, n)