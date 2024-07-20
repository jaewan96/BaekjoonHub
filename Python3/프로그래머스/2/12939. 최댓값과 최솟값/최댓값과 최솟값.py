def solution(s):
    lst = []
    start = 0
    for i in range(len(s)):
        if s[i] == ' ':
            lst.append(int(s[start:i]))
            start = i+1
        elif i == len(s) -1:
            lst.append(int(s[start:i+1]))
    maxN = str(max(lst))
    minN = str(min(lst))
    answer = minN + ' ' + maxN
    return answer