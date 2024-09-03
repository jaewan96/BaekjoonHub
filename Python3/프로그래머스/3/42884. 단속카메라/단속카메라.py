def solution(routes):
    answer = 1
    routes.sort(key = lambda x: x[1])
    start = routes[0][1]
    for i in range(1, len(routes)):
        if routes[i][0] <= start <= routes[i][1]:
            pass
        else:
            answer += 1
            start = routes[i][1]
    return answer