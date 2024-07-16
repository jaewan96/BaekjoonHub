def solution(s):
    answer = True
    if len(s) == 4 or len(s) == 6:
        pass
    else:
        return answer == False
    for i in s:
        if ord(i) >= 65:
            return answer == False
    return answer