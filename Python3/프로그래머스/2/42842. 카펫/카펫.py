def solution(brown, yellow):
    answer = []
    for i in range(1, brown//2):
        row = (brown - i*2 + 4)//2
        if row * i == brown + yellow:
            answer = [row, i]
            break
    return answer