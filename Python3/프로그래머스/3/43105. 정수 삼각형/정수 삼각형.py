def solution(triangle):
    lst = triangle[-1]
    for i in range(len(triangle)-2 , -1, -1):
        for j in range(i+1):
            if triangle[i][j] + lst[j] >= triangle[i][j] + lst[j + 1]:
                lst[j] += triangle[i][j]
            else:
                lst[j] = triangle[i][j] + lst[j + 1]
    return lst[0]