def solution(s, n):
    answer = ''
    for i in s:
        num = ord(i) + n
        if i == ' ':
            answer += ' '
        elif num >= 123:
            alp = chr(num - 26)
            answer += alp
        elif num >= 91 and num - n <= 90:
            alp = chr(num - 26)
            answer += alp
        else:
            answer += chr(ord(i) + n)
    return answer