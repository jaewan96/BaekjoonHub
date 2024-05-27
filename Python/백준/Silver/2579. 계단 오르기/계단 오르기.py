N = int(input())
lst = [int(input()) for _ in range(N)]

if N == 1:
    print(lst[0])
elif N == 2:
    print(lst[0] + lst[1])
else:
    dp = [0] * N  # 각 칸에서 얻을 수 있는 점수의 최대값
    dp[0] = lst[0]
    dp[1] = lst[0] + lst[1]
    dp[2] = max(lst[0] + lst[2], lst[1] + lst[2]) # 세번째 칸의 경우 3번 연속 한칸만 움직일 수 없으니 1, 3 또는 2, 3칸을 올랐을 때의 최대값

    for i in range(3, N):
        dp[i] = max(dp[i-2] + lst[i], dp[i-3] + lst[i-1] + lst[i]) # 2칸을 올랐을 때와 3계단 전에서 2계단을 오르고 한 계단을 오를 경우

    print(dp[N-1])