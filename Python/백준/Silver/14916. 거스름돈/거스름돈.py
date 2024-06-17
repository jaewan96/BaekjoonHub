def change(n):
    for i in range(n // 5, -1, -1):
        remain = n - (i * 5)
        if remain % 2 == 0:
            return i + remain // 2
    return -1

N = int(input())
print(change(N))