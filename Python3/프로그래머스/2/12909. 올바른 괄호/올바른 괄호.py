def solution(s):
    lst = []
    for i in s:
        if i == '(':
            lst.append(i)
        elif i == ')':
            if lst:
                lst.pop()
            else:
                return False
    if lst:
        return False
    else:
        return True
