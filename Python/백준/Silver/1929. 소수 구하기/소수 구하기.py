import math

def sieve(M, N):   # 소수를 구하기 위한 함수
    lst = [True] * (N+1)    # 모든 N개의 수를 True로 두고 리스트로 만든다
    lst[0] = lst[1] = False # 0과 1은 소수가 아니므로 False

    for i in range(2, int(math.sqrt(N))+1):   # N의 제곱근 만큼 반복
        if lst[i]:   # i가 소수일 경우
            for j in range(i*i, N+1, i):   # i의 배수는 모드 False로 소수가 아니다
                lst[j] = False

    for number in range(M, N+1):
        if lst[number]:
            print(number)

M, N = map(int, input().split())
sieve(M, N)
