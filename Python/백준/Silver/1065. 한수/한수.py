N = int(input())

cnt = 0
if N < 100:
    print(N)
else:
    for i in range(100, N+1):
        hundreds = i//100
        tens = (i - hundreds*100)//10
        ones = i % 10
        if hundreds - tens == tens - ones:
            cnt += 1
    print(cnt + 99)
