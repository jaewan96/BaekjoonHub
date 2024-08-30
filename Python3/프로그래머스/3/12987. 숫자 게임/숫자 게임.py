def solution(A, B):
    answer = 0
    A.sort()
    B.sort()
    i, j = 0, 0
    while i < len(A) and j < len(B):
        if B[j] > A[i]:
            j += 1
            i += 1
            answer +=1
        else:
            j += 1
    return answer