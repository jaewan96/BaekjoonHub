def solution(s):
    alp = s.upper()
    if alp.count('P') == alp.count('Y'):
        return True
    else:
        return False
    