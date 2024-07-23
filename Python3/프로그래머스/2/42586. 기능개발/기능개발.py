import math

def solution(progresses, speeds):
    answer = []
    cnt = 1
    end = math.ceil((100 - progresses[0]) / speeds[0])
    for i in range(1, len(progresses)):
        if math.ceil((100 - progresses[i]) / speeds[i]) <= end:
            cnt += 1
        else:
            answer.append(cnt)
            cnt = 1
            end = math.ceil((100 - progresses[i]) / speeds[i])
    answer.append(cnt)

    return answer