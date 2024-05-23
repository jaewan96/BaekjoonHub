N = int(input())
dp = [0 for _ in range(N+1)]  # n번째 피보나치 수를 구할 list
dp[0] = 0 # 첫 시작은 0
dp[1] = 1 # 첫 시작 1
for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2] # 바로 앞 두 피보나치 수의 합
print(dp[N])