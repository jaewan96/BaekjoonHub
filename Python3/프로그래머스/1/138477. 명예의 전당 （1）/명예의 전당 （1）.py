def solution(k, score):
    answer = []
    result = []
    for i in range(len(score)):
        answer.append(score[i])
        if i >= k-1:
            answer.sort()
            result.append(answer[-k])
        else:
            answer.sort()
            result.append(answer[0])
            
    return result