def solution(sticker):
    answer = 0
    N = len(sticker)
    if N == 1:
        return sticker[0]
    elif N == 2:
        return max(sticker[0], sticker[1])
    elif N == 3:
        return max(sticker[0] + sticker[2], sticker[1])
    
    dp_start = [0] * N
    dp_second = [0] * N
    dp_start[0] = sticker[0]
    dp_start[1] = max(sticker[0], sticker[1])
    for i in range(2, N - 1):
        dp_start[i] = max(dp_start[i-1], dp_start[i-2] + sticker[i])
    
    dp_second[1] = sticker[1]
    dp_second[2] = max(sticker[1], sticker[2])
    for i in range(3, N):
        dp_second[i] = max(dp_second[i-1], dp_second[i-2] + sticker[i])
    
    answer = max(dp_start[N-2], dp_second[N-1])

    return answer