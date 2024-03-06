
N, M = map(int, input().split())

arr = [list(input()) for _ in range(N) ]

DNA = [{ 'A' : 0, 'C' : 0, 'G' : 0, 'T' : 0 } for _ in range(M)]

for i in arr:
    for index, nucleo in enumerate(i):
        DNA[index][nucleo] += 1

new_DNA = ''
cnt = 0
for i in DNA:
    alp = max(i, key=i.get)
    new_DNA += alp
    cnt += sum(i.values()) - i[alp]

print(new_DNA)
print(cnt)